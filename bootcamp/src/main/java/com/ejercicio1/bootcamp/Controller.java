package com.ejercicio1.bootcamp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private MessageServiceImpl mensaje;
	
	  @Autowired
	  private userRepository userRepository;
	
	//@Value("${course.message}")
	//private String message;
	
	@GetMapping(path="/api/v1/message")
    public String message() {
       // return "Hello World!";
    	return mensaje.getMessage();
    }
	
	
	
	
	@GetMapping(path="/api/v1/users")
	  public List<User> findAll() {
	    return userRepository.findAll();
	  }
	@GetMapping(path="/api/v1/users/{id}")
	  public Optional<User> findById(@PathVariable Long id) {
	    return userRepository.findById(id);
	  }
	@DeleteMapping(path="/api/v1/users/delete/{id}")
	  public void deleteById(@PathVariable Long id) {
	     userRepository.deleteById(id);
	     System.out.println("Borrado el id " + id);
	  }
	
    @PostMapping("/api/v1/users/save")
    public ResponseEntity<User> save(@RequestBody User user) {
        System.out.println("pruebaaaa "+user.getName().toString()+"  -----  "+ user.getBirthDate().toString());
        User savedUser = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }
//    @PutMapping("/api/v1/users")
//    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
//        user.setId(id);
//        User updatedUser = userRepository.save(user);
//        return ResponseEntity.ok(updatedUser);
//    }
}
