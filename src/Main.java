import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Game variables
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		boolean isGameOver=false;
		Random rand = new Random();
		String zombie[] = {"Close-range Zombie", "Mid-range Zombie", "Long-range Zombie"};
		
		
		//Creating our Weapon Objects
		Weapon shotgun = new Weapon("Shotgun",4,50f);
		Weapon ar = new Weapon("Assault Rifle", 30, 25f);
		Weapon sniper = new Weapon("Sniper Rifle", 5, 100f);			
		//Adding our objects in an ArrayList
		List<Weapon> loadout = new ArrayList<Weapon>();
		loadout.add(shotgun);
		loadout.add(ar);
		loadout.add(sniper);
		
		//Creating our Player Object
		Player p1 = new Player(loadout, 100);
		List<Weapon> backpack = p1.getWeapons();
		
		
		int n = rand.nextInt(3);
		while(!isGameOver) {
			n = rand.nextInt(3);
			System.out.println("There is a " + zombie[n]);
			System.out.println("Pick a weapon");
			p1.printWeapons(backpack);
			choice = sc.nextInt();
			System.out.println("You chose " + backpack.get(choice-1).getName());
			if (choice-1 == n) {
				if (backpack.get(choice-1).getAmmo() == 0) {
					System.out.println("No ammos. Game over.");
					isGameOver = true;
					break;
				}
				for (Weapon w : backpack) {
					if (w.getAmmo() == 0) {
						p1.reload(backpack);
						break;
					}
				}
				backpack.get(choice-1).shoot(100);
				System.out.println("Yey! You killed it!");
				
			}
			else {
				System.out.println("Wrong gun!");
				isGameOver = true;
			}
			
		}
	}

}
