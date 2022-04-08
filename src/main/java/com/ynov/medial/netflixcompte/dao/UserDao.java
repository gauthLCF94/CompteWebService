package com.ynov.medial.netflixcompte.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynov.medial.netflixcompte.model.User;
import com.ynov.medial.netflixcompte.repo.UserRepo;

@Service
public class UserDao implements IUserDao {

	@Autowired
	public UserRepo userRepo;
	
	public List<User> findAlluser(){
		return userRepo.findAll();
	}
	
	public User finduserById(Integer userId) {
		return null;
	}
	
	public User save(User userId) {
		return userRepo.save(userId);
	}
	
	public boolean delete(String userId) {
		userRepo.deleteById(userId);
		return true;
	}

	@Override
	public boolean deleteById(String userId) {
		// TODO Auto-generated method stub
		return false;
	}


}
