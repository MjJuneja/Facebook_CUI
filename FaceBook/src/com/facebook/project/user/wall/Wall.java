package com.facebook.project.user.wall;

import java.util.Scanner;

import com.facebook.project.mainView.MainScreen;

public class Wall {
	
	public void ShowWall(){
		
		System.out.println("===Fb====|Search Box|========Home==Notify====Logout===============================");
		System.out.println("                                                                                  ");
		System.out.println("New Feeds                                                                         ");
		System.out.println("Candy Crush                                                                       ");
		System.out.println("Events                  Photo/Video  Album                                        ");
		System.out.println("                 |=================================|                              ");
		System.out.println("                 | What's on your mind?            |                              ");
		System.out.println("                 |                                 |                              ");
		System.out.println("                 |=================================|                              ");
		System.out.println("                                  |Friends!| |Post|                               ");
		System.out.println("                                                                                  ");
		System.out.println("        (Tanmay Gupta) feeling awesome with Angel priya and 49 others             ");
		System.out.println("            January 15 , Delhi                                                    ");
		System.out.println("        _________________________________________________________________         ");
		System.out.println("       | Virat Kohli is the new captain of india. feeling really excited |        ");
		System.out.println("       | even he won his first match as captain with dhoni as a wicket-  |        ");
		System.out.println("       | keeper plaer. He is a dynamic player and india is proud to have |        ");
		System.out.println("       | him as the captain of India.                                    |        ");
		System.out.println("       |_________________________________________________________________|        ");
		System.out.println("         Like  Comment  Share                                                     ");
		System.out.println("         49liked  12shares                                                        ");
		System.out.println("         view 7 more comments                                                     ");
		System.out.println("         Raj Kumar                                                                ");
		System.out.println("         But i miss Dhoni as captain :(                                           ");
		System.out.println("              Like Reply                                                          ");
		System.out.println("         Manish Paul                                                              ");
		System.out.println("         Vk is all cool and awesome cricketer                                     ");
		System.out.println("              Like Reply                                |-------------------|     ");
		System.out.println("                                                        |    Chat Box       |     ");
		System.out.println("                                                        |-------------------|     ");
		System.out.println("Do you want to Logout(Press 1):                                                            ");
		System.out.println("==================================================================================");
		Scanner scan= new Scanner(System.in);
		int option= scan.nextInt();
		if(option==1)
		{
			MainScreen main= new MainScreen();
			main.Screen();
		}
		scan.close();
	}

}
