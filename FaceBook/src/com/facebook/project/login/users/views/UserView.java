package com.facebook.project.login.users.views;

import java.util.Scanner;

import com.facebook.project.login.users.dto.MessageDTO;
import com.facebook.project.login.users.dto.UserDTO;
import com.facebook.project.login.users.helper.UserHelper;
import com.facebook.project.user.wall.Wall;

public class UserView {
	public void doLogin(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.nextLine();
		System.out.println("Enter the Password");
		String password = scanner.nextLine();
//		System.out.println("Enter the PinCode");
//		String pinCode = scanner.nextLine();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
//		userDTO.setPinCode(pinCode);
		UserHelper helper = new UserHelper();
		  MessageDTO messageDTO = helper.isUserExist(userDTO); 
		 
		  try {
			  System.out.println("Loading....");
			  Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(messageDTO.getMessage()+" "+messageDTO.getStatus());
		if(messageDTO.getStatus().equals("SUCCESS"))
		{
			Wall wall= new Wall();
			
			wall.ShowWall();
		}
		scanner.close();
		
	}
	public static void main(String[] args) {
		UserView view = new UserView();
		view.doLogin();
	}
}
