package com.facebook.project.register.users.DTO;

public class UsersDTO {
   private String f_name;
   private String l_name;
   private String mobile;
   private String email;
   private String password;
   private String re_password;
   private String date;
   private String gender;
    
   
  public UsersDTO(){
	   
   }
  
 
   
  public UsersDTO(String f_name,String l_name,String email,String mobile,String password,String date,String gender){
	   
	   this.f_name=f_name;
	   this.l_name=l_name;
	   this.mobile=mobile;
	   this.email=email;
	   this.password=password;
//	   this.re_password=re_password;
	   this.date=date;
	   this.gender=gender;
   }
   
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
}
public String getL_name() {
	return l_name;
}
public void setL_name(String l_name) {
	this.l_name = l_name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRe_password() {
	return re_password;
}
public void setRe_password(String re_password) {
	this.re_password = re_password;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
   
   
}
