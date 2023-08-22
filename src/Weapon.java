

public class Weapon {
	private int ammo;
	private float damage;
	private String name;
	
	Weapon(){
		
	}
	
	Weapon(String name, int ammo, float damage){
		setName(name);
		setAmmo(ammo);
		setDamage(damage);
	}
	
	
	public int getAmmo() {
		return ammo;
	}
	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}
	public float getDamage() {
		return damage;
	}
	public void setDamage(float damage) {
		this.damage = damage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void shoot(float health) {
		while(getAmmo()!=0) {
			
			if (health == 0) {
				break;
			}
			else {
				setAmmo(getAmmo()-1);
				health -= getDamage();
				System.out.println("Ammo: " + getAmmo());
			}
			
		}
	}
	
}
