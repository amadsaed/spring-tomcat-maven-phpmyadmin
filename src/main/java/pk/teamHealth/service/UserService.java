package pk.teamHealth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pk.teamHealth.model.User;
import pk.teamHealth.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User createUser(String user_name, String last_name) {
		User user = new User( user_name, last_name);
		return  userRepository.save(user);
		
	}
	

	public List<User> listUser() {
		 
	List<User> list = new ArrayList<User>();
	Iterable <User> users = userRepository.findAll();
	users.forEach(list::add); 
	return list;
	}
	
    

}
