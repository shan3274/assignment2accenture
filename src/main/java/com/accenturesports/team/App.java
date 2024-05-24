package com.accenturesports.team;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

/*Create a Java Maven application using maven golas(compile,testCompile & jar)
to manage a set of players in a sports team using the Set collection. 
The application should allow adding players, removing players, checking if
a player is on the team, and displaying all players.*/
public class App 
{
    public static void main( String[] args )
    {
    	HashSet<String> players = new HashSet();
        Scanner sc = new Scanner(System.in);
        
        
		boolean runs = true;
		while(runs) {
			System.out.println("Enter your choice:");
	        System.out.println("1> Add player");
	        System.out.println("2> Remove player");
	        System.out.println("3> Display all the players");
	        System.out.println("4> Quit");
	        int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the player name :");
				String name = sc.next();
				System.out.println("Enter the player id :");
				String id = sc.next();
				System.out.println("Enter the player role :");
				String role = sc.next();
				Add add = new Add(name, id, role);
				players.add(add.details());
				System.out.println("Successfully added");
				break;
			case 2:
				System.out.println("Enter id to remove");
				String value = sc.next();
				Remove remove = new Remove();
				players = remove.remove(players, value);
				System.out.println("Successfully remove");
			case 3:
				for (String player : players) {
					System.out.println(player);
				}
				break;
			case 4:
				runs = false;
	        }
		}
    }
}
