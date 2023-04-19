package com.ejercicio1.bootcamp;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class User {

	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;

	  private String name;

	  @Column
	  private LocalDate birthDate;

	  // Constructor vacío
	  public User() {
	  }
	  
	  
	  
	  public User(Long id, String name, LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}



	// Getters y setters
	  public Long getId() {
	    return id;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public LocalDate getBirthDate() {
	    return birthDate;
	  }

	  public void setBirthDate(LocalDate birthDate) {
	    this.birthDate = birthDate;
	  }
}
