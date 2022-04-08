package com.ynov.medial.netflixcompte.dao;

import java.util.List;

import com.ynov.medial.netflixcompte.model.User;

public interface IUserDao {
	
	public List<User> findAlluser();
	
	public User finduserById(Integer userId);
	
	public User save(User userId);
	
	public boolean deleteById(String userId);
}
