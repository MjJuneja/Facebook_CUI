package com.facebook.project.register.users.view;

import java.util.Scanner;

import com.facebook.project.login.users.dto.MessageDTO;
import com.facebook.project.mainView.MainScreen;
import com.facebook.project.register.users.DTO.UsersDTO;
import com.facebook.project.register.users.helper.UsersHelper;

public class UsersView {
   public void doRegister(){
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter first name");
	   String f_name = scan.nextLine();
	   System.out.println("Enter last name");
	   String l_name= scan.nextLine();
	   System.out.println("Enter mobile number");
	   String mobile= scan.nextLine();
	   System.out.println("Enter email address");
	   String email= scan.nextLine();
	   System.out.println("Enter password");
	   String password=scan.nextLine();
	   System.out.println("Enter password again");
	   String re_password=scan.nextLine();
	   System.out.println("Enter Date of Birth (DD/MM/YYYY)"); 
	   String date= scan.nextLine();
	   System.out.println("Enter your Gender (Male/Female)");
	   String gender= scan.nextLine();
	   
	   
	   UsersDTO userdto_f=new UsersDTO();
	   userdto_f.setF_name(f_name);
	   userdto_f.setL_name(l_name);
	   userdto_f.setDate(date);
	   userdto_f.setEmail(email);
	   userdto_f.setMobile(mobile);
	   userdto_f.setPassword(password);
	   userdto_f.setRe_password(re_password);
	   userdto_f.setGender(gender);
	   
	   UsersHelper help= new UsersHelper();
	   MessageDTO message=help.isAdded(userdto_f);
	   System.out.println(message.getMessage()+"! status:"+message.getStatus());
	   
	   try {
		   System.out.println("Loading...");
		Thread.sleep(1000);
		MainScreen main= new MainScreen();
		main.Screen();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 
	   scan.close();
	   
   }
   
   public static void main(String[] args) {
	UsersView user= new UsersView();
	user.doRegister();
}
}
