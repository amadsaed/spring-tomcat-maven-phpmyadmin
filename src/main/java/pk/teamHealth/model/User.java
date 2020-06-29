package pk.teamHealth.model;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {

 

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
    private Long id;

 
    private String userName;

    private String lastName;


    public User(String userName, String lastName) {
		super();
		this.userName = userName;
		this.lastName = lastName;
	}

	public User() {
        super();
        
    }
  

    public Long getId() {
        return id;
    }

 

    public String getUserName() {
        return userName;
    }

 

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getLastName() {
        return lastName;
    }

 

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
