package io.com.springsecurityjwt.entiry;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	private Integer userId;

	private String userName;
	private String password;
	private Date createdDate;
	private Date updatedDate;
	private Boolean isActive;
	private Character islocked;

	public Users() {
		super();
	}

	public Users(Integer userId, String username, String password, Date createdDate, Date updatedDate, Boolean isActive,
			Character islocked) {
		super();
		this.userId = userId;
		this.userName = username;
		this.password = password;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.isActive = isActive;
		this.islocked = islocked;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Character getIslocked() {
		return islocked;
	}

	public void setIslocked(Character islocked) {
		this.islocked = islocked;
	}

}
