package Exercises.Services;

import Class.SubClass.User;

public class UserServices {

	public Boolean checkUser(String user) {

		User user2 = new User();
		
		return user2.getUser().equals(user) ? true : false;
	}

	public Boolean checkPassword(String password) {

		User user = new User();
		
		return user.getPassword().equals(password) ? true : false;

	}
}
