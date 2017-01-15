package com.facebook.project.mainView;

import java.util.Scanner;

import com.facebook.project.login.users.views.UserView;
import com.facebook.project.register.users.view.UsersView;

public class MainScreen {
String str ;
   @SuppressWarnings("resource")
public void Screen(){
	   System.out.println("=======================================================================");
	   System.out.println("                                Facebook                               ");
	   System.out.println("=======================================================================");
	   System.out.println("   Select your option:                                                 ");
	   System.out.println("     1.)Login                                                          ");
	   System.out.println("     2.)Register                                                       ");
	   System.out.println("     3.)Exit                                                           ");
	   System.out.println(                                                                         );
	   System.out.println("=======================================================================\n");
	  
	   do{
		   str="no";
		   System.out.print("Selected option:");
		   Scanner scan= new Scanner(System.in);
		   int option= scan.nextInt();   
	   switch (option) {
	case 1: UserView user = new UserView();
		 user.doLogin();
		break;
	case 2: UsersView USER= new UsersView();
	     USER.doRegister();
		break;
	case 3: System.exit(0);	
	    break;
	default: System.out.println("Wrong option selected!");
		break;
	}
	 if(option!=1 && option!=2){
	   System.out.println("Do you want to repeat");
       str=scan.next();
//       scan.close();
       }
	   }while(str.toLowerCase().equals("yes"));
	   
   }
	
	public static void main(String[] args) {
		
	
	
	 MainScreen ms = new MainScreen();
	 ms.Screen();
	
	
	}
}
