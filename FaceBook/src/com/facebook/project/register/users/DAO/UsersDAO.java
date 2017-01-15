package com.facebook.project.register.users.DAO;

import com.facebook.project.login.users.dto.MessageDTO;
import com.facebook.project.register.users.DTO.UsersDTO;
//import com.facebook.project.register.users.helper.UsersHelper;

public class UsersDAO {
	UsersDTO usersDTOArray[];

	
	public MessageDTO AddUser(UsersDTO userdto){
		
		MessageDTO message =new MessageDTO();
		String message1 = "Invalid Data";
		String status = "Failed";
//		UsersHelper help= new UsersHelper();
//		if(help.validate(userdto))
//		{  
			usersDTOArray= new UsersDTO[]{
					new UsersDTO( userdto.getF_name(), userdto.getL_name(), userdto.getEmail(),userdto.getMobile(),
							userdto.getPassword(),userdto.getDate(),userdto.getGender())
			};
//		userDTOArray= new UsersDTO[]{
//			new UsersDTO("m","j", "email@g","1234567899"," password"," date", "gender")	
//		};
			message1=userdto.getF_name()+ " Successfully Registered";
			status="Success";
		
		message.setMessage(message1);
		message.setStatus(status);
		return message;
	}
	
//	
//	public static void main(String[] args) {
//		UsersDAO use= new UsersDAO();
//		UsersDTO ad= new UsersDTO(); 
//		use.AddUser(ad);
//		System.out.println(use.userDTOArray[0].toString());
//	}

}
