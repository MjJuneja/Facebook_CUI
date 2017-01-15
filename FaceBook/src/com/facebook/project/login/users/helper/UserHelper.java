package com.facebook.project.login.users.helper;

import com.facebook.project.login.users.dao.UserDAO;
import com.facebook.project.login.users.dto.MessageDTO;
import com.facebook.project.login.users.dto.UserDTO;

public class UserHelper{
	// String name = "    Amit     Srivastava     ";
	public boolean validate(UserDTO userDTO){
		boolean isValidate  = false;
		if(userDTO.getUserid().trim().length()>0
				&& userDTO.getPassword().trim().length()>0
//				&& userDTO.getPinCode().trim().length()>=4 
//				&& userDTO.getPinCode().trim().length()<=8
				){
			isValidate = true;
		}
		return isValidate;
		
	}
	
	public MessageDTO isUserExist(UserDTO userDTO){
		
		if(validate(userDTO)){
			UserDAO userDAO = new UserDAO();
			MessageDTO message= new MessageDTO();
			message= userDAO.authenticateUser(userDTO);
			
			return message;
			
		}
		else
		{
			MessageDTO messageDTO = new MessageDTO();
			messageDTO.setMessage("Validation Fail....");
			messageDTO.setStatus("VALID_FAIL");
			return messageDTO;
			//userDTO.setMessage("Validation Fail....");
		}
//		return message;
		//return userDTO;
	}

}
