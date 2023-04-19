package com.ejercicio1.bootcamp;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User,Long> {
	
	
	  public List<User> findAll();
	  public Optional<User> findById(Long id);
	  public void deleteById(Long id);
	  public User save(User user);

}
