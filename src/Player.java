import java.util.ArrayList;
import java.util.List;

public class Player {
	private int health;
	private List<Weapon> weapons;
	
			
	Player(){
		
		
	}
	
	Player(List<Weapon> weapons, int health){
		setHealth(health);
		setWeapons(weapons);
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public List<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	
	public void printWeapons(List<Weapon> backpack) {
		int i=1;
		
		for (Weapon w : backpack) {
			System.out.print(i + ") name: " + w.getName() + "\tammo: " + w.getAmmo() + ((i==2)?" damage: " : "\t damage: ") + w.getDamage());
			System.out.println();
			i++;
		}
	}

	public void reload(List<Weapon> weapons) {
		for (Weapon w : weapons) {
			if (w.getAmmo() == 0) {
				if (w.getName().equals("Shotgun")) {
					w.setAmmo(4);
					
				}
				else if (w.getName().equals("Assault Rifle")) {
					w.setAmmo(30);
				}
				else if (w.getName().equals("Sniper Rifle")) {
					w.setAmmo(5);
				}
				else {
					w.setAmmo(0);
				}
				
			}
		}
		System.out.println("Gun reloaded");
	}
	
}
