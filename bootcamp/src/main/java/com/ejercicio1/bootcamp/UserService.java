package com.ejercicio1.bootcamp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	  @Autowired
	  private userRepository userRepository;

		public long count() {
			return userRepository.count();
		}
	  
	  public List<User> findAll() {
	    return userRepository.findAll();
	  }
	  public Optional<User> findById(Long id) {
		    return userRepository.findById(id);
		  }
	  public void deleteById(Long id) {
		    //return userRepository.deleteById(id);
		  }
	  public User save(User user) {
	       // System.out.println("pruebaaaa "+user.getName().toString()+"  -----  "+ user.getId().toString()+"   ----   "+ user.getBirthDate().toString());
		  return userRepository.save(user);
		 // return usuario;
	  }
	//
	//  @Override
	//  public List<User> findAll() {
//	    return userRepository.findAll();
	//  }
	//
	//  @Override
	//  public User save(User user) {
//	    return userRepository.save(user);
	//  }
	//
	//  @Override
	//  public void deleteById(Long id) {
//	    userRepository.deleteById(id);
	//  }
}
