package pk.teamHealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pk.teamHealth.model.User;
import pk.teamHealth.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value ="/createUser", method = RequestMethod.POST)
	public ResponseEntity<User> createUser (@RequestParam String user_name, @RequestParam String last_name){
		User newUser = userService.createUser(user_name, last_name);
		return new ResponseEntity<User>(newUser , HttpStatus.CREATED);
	}

	
	@RequestMapping(value ="/user", method = RequestMethod.GET)
	
	public ResponseEntity<User> userList (){
		
		List<User> users= userService.listUser();
		
		return new ResponseEntity(users , HttpStatus.OK);

		
	}
	
	
}
