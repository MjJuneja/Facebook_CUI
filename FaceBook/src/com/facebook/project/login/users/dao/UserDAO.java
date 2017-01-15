package com.facebook.project.login.users.dao;

import com.facebook.project.login.users.dto.MessageDTO;
import com.facebook.project.login.users.dto.UserDTO;
import com.facebook.project.register.users.DTO.UsersDTO;

public class UserDAO {
	// Array of Objects
	//UserDTO userDTO[] = new UserDTO[5];
	UserDTO userDTOArray[];
//	int index = 0;
//	private void fill(String uid, String pwd, String pinCode){
//		userDTO[index].setUserid(uid);
//		userDTO[index].setPassword(pwd);
//		userDTO[index].setPinCode(pinCode);
//		index++;
//	}
	UsersDTO usersdto =new UsersDTO();
	private void prepareDB(){
		String email=usersdto.getEmail();
		String pass=usersdto.getPassword();
		userDTOArray = new UserDTO[]{
				new UserDTO("amit","123"),
				new UserDTO("ram","123")
				, new UserDTO("shyam","123")
				,new UserDTO("mike","123"), 
				new UserDTO("tom","123"),
				new UserDTO(email,pass)					
		};
		}


		

	
	public MessageDTO authenticateUser(UserDTO userDTO){
		prepareDB();
		String message = "Invalid Userid or password";
		String status = "FAIL";
		
		
		for(UserDTO userObject : userDTOArray){
			if(userObject.getUserid().equals(userDTO.getUserid())
					&& userDTO.getPassword().equals(userObject.getPassword()) 
					//&& userDTO.getPinCode().equals(userObject.getPinCode())
					){
				message = "Welcome "+userDTO.getUserid();
				status = "SUCCESS";
				
				break;
			}
					
		}

		MessageDTO messageDTO = new MessageDTO();
		messageDTO.setMessage(message);
		messageDTO.setStatus(status);
		return messageDTO;
				
	}

}
