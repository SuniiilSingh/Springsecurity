package io.com.springsecurityjwt.service;


import org.springframework.stereotype.Service;

import io.com.springsecurityjwt.entiry.Users;

@Service
public interface UserService {

	Users findByUserName(String userName);

}
