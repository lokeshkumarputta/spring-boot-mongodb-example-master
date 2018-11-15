package com.elife.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Users {

  /* 
    private Integer id;*/
    private String username;
    private String password;
    private String confirmpassword;
    private String firstname;
    private String lastname;
    private String homeaddress;
    private String officeaddress;
    
    
    
	public Users(/*Integer id,*/ String username, String password, String confirmpassword, String firstname, String lastname, String homeaddress,
			String officeaddress) {
		super();
//		this.id = id;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.firstname = firstname;
		this.lastname = lastname;
		this.homeaddress = homeaddress;
		this.officeaddress = officeaddress;
	}



	public Users() {
		super();
	}
    
    

    
}
