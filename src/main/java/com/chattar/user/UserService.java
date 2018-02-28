package com.chattar.user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User("raj", "advi"));
		users.add(new User("datta", "advi"));
		users.add(new User("smita", "advi"));
		users.add(new User("shashi", "advi"));
	}
	
	List<User> getUsers(String user){
		return users;
	}

	public void addUser(User user) {
		users.add(user);
	}

	public void deleteUser(String userName) {
		for(Iterator<User> it = users.iterator();it.hasNext();) {
			User user = it.next();
			if(user.getUserName().equals(userName)) {
				it.remove();
			}
		}
		
	}
	
	
}
