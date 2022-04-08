package com.ynov.medial.netflixcompte.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ynov.medial.netflixcompte.dao.IUserDao;
import com.ynov.medial.netflixcompte.model.User;

@RestController
public class userController {
	
	public static List<User> listDeMesusers = new ArrayList<User>();
	
	@Autowired
	IUserDao myDao;

	static {
		User user1 = new User("1", "Gauthier", 43);
		User user2 = new User("2", "Jojo", 9);
		User user3 = new User("3", "Toma", 268);
		
		listDeMesusers.add(user1);
		listDeMesusers.add(user2);
		listDeMesusers.add(user3);
	}

	@GetMapping("/users")
	public List<User> getAlluser(){
		
		return myDao.findAlluser();
	}
	
	@GetMapping("/user/{iduser}")
	public User getuserById(@PathVariable String iduser) {
		for(User user : listDeMesusers) {
			if(user.getId() == iduser) {
				return user;
			}
		}
		//todo get 1 user
		return null;
		
	}
	
	@PostMapping("/user/add")
	public boolean adduser(@RequestBody User userToSave) {
		
	 myDao.save(userToSave);
	 return true;
		
		
	}
	
	@GetMapping("/user/{iduser}")
	public User deleteuserById(@PathVariable String iduser) {
		//delete user
		myDao.deleteById(iduser);
		return null;
		
	}
}
