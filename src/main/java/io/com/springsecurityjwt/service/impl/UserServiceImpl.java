package io.com.springsecurityjwt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.com.springsecurityjwt.entiry.Users;
import io.com.springsecurityjwt.repository.UserRepository;
import io.com.springsecurityjwt.service.UserService;
/**
 * 
 * @author ssing109
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Users findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(userName);
	}

}
