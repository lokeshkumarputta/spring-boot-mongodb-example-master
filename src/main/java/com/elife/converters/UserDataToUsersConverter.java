package com.elife.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.elife.documents.Users;
import com.elife.models.UserData;

@Component
public class UserDataToUsersConverter implements Converter<UserData, Users>{

	@Override
	public Users convert(UserData source) {
		Users users = new Users(/*source.getId(),*/ source.getFirstname(), 
				source.getLastname(), source.getUsername(), 
				source.getPassword(), source.getConfirmpassword(), 
				source.getHomeaddress(),
				source.getOfficeaddress());
		
		return users;
	}

}
