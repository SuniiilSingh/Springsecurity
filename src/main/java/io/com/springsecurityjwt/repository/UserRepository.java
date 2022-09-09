package io.com.springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.com.springsecurityjwt.entiry.Users;
/**
 * 
 * @author ssing109
 *
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	Users findByUserName(String userName);

}
