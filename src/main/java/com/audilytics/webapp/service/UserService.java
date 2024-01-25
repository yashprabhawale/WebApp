package com.audilytics.webapp.service;

import com.audilytics.webapp.dto.UserDto;
import com.audilytics.webapp.model.User;

public interface UserService {

	User save(UserDto userDto);
	
}
