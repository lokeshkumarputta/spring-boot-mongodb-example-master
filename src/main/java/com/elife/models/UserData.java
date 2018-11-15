package com.elife.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserData implements Serializable{

	    /**
	 * 
	 */
	private static final long serialVersionUID = 3300969610501699201L;
//		private Integer id;
	    private String username;
	    private String password;
	    private String confirmpassword;
	    private String firstname;
	    private String lastname;
	    private String homeaddress;
	    private String officeaddress;
	    
	    
		public UserData(/*Integer id,*/ String username, String password, String confirmpassword, String firstname,
				String lastname, String homeaddress, String officeaddress) {
			super();
//			this.id = id;
			this.username = username;
			this.password = password;
			this.confirmpassword = confirmpassword;
			this.firstname = firstname;
			this.lastname = lastname;
			this.homeaddress = homeaddress;
			this.officeaddress = officeaddress;
		}


		public UserData() {
			super();
		}
	    
}
