package com.facebook.project.register.users.helper;

import com.facebook.project.login.users.dto.MessageDTO;
import com.facebook.project.register.users.DAO.UsersDAO;
import com.facebook.project.register.users.DTO.UsersDTO;



public class UsersHelper {

	public boolean validate(UsersDTO userdto){
		boolean isValidate  = false;
		if(userdto.getF_name().trim().length()>0
				&& userdto.getPassword().trim().length()>0
				&& userdto.getRe_password().trim().length()>0 
				&& userdto.getDate().trim().length()>0
				&& userdto.getL_name().trim().length()>0
				&& userdto.getEmail().trim().length()>0
				&& userdto.getGender().trim().length()>0
				&& userdto.getMobile().trim().length()==10
				&& userdto.getEmail().trim().contains("@") 
				){
			
			if(userdto.getPassword().equals(userdto.getRe_password()))
			isValidate = true;
		}
		return isValidate;	
	}
	
	public MessageDTO isAdded(UsersDTO userdto){
		
		if(validate(userdto))
		{
			UsersDAO userdao= new UsersDAO();
			MessageDTO message= new MessageDTO();
			message=userdao.AddUser(userdto);
			return message;
		}
		else
		{
			MessageDTO message= new MessageDTO();
			message.setMessage("Invalid");
			message.setStatus("failed");
			return message;
		}
		
	}
	
	
	
//	public MessageDTO AddtoLoginDAO(UsersDTO userdto){
//	
//		
//		
//	}
	
	
	
}
