package io.com.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.com.springsecurityjwt.entiry.Users;
import io.com.springsecurityjwt.service.UserService;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		try {
			Users users = userService.findByUserName(userName);

			return new User(users.getUsername(), users.getPassword(), new ArrayList<>());
		} catch (UsernameNotFoundException e) {
			// TODO: handle exception
		}
		return new User("", "", new ArrayList<>());

	}
}