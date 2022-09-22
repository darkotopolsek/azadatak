package com.omicron.atest;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "user")
public class User implements Serializable {

    
    private long id;

    @NotNull
    @Size(min = 2, max = 30)
    private String name;

    @NotNull
    @Size(min = 2, max = 30)
    private String surname;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/mm/yyyy")
    private String dob;

    @NotNull
    @Size(min = 2, max = 60)
    private String email;

    protected User() {

    }
    
    protected User(Long id, String name, String surname, String dob, String email) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.email = email;
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
