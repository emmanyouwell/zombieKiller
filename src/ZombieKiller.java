import java.util.Random;
import java.util.Scanner;

public class ZombieKiller {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
	
		
		
		int n = rand.nextInt(3); //0-2
	
		String zombie[] = {"Close-range Zombie", "Mid-range Zombie", "Long-range Zombie"};
		String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
		boolean isGameOver=false;
		
		
		while(!isGameOver) {
			n = rand.nextInt(3);
			System.out.println("There is a " + zombie[n]);
			System.out.println("Pick a weapon in your backpack: ");
			
			for (int i=0; i<3; i++) {
				System.out.println((i+1) + " - " + backpack[i]);
			}
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			if (backpack[n] == backpack[choice-1]) {
				System.out.println("Nice! You Killed it!");
			}
			else {
				System.out.println("Wrong gun! Game Over!");
				isGameOver = true;
			}
		}
	}

}
