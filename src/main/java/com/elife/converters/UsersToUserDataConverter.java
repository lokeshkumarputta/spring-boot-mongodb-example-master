package com.elife.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.elife.documents.Users;
import com.elife.models.UserData;

/*@Component
public class UsersToUserDataConverter implements Converter<Users, UserData>{

	@Override
	public UserData convert(Users source) {
		UserData userData = new UserData(source.getId(), source.getFirstname(), 
				source.getLastname(), source.getUsername(), 
				source.getPassword(), source.getConfirmpassword(), 
				source.getHomeaddress(),
				source.getOfficeaddress());
		
		return userData;
	}

}*/
