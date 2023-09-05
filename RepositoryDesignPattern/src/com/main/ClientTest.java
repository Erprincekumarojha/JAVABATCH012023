package com.main;

import java.util.List;

import com.controller.UserController;
import com.entity.User;

public class ClientTest {

	public static void main(String[] args) {
		
		System.out.println("Repository Desing Pattern");
		
	    UserController controller = new UserController();
	    //save 3 user
	    controller.save(new User(101L, "prince", "price@gmail.com"));
	    controller.save(new User(102L, "Deepak", "deepak@gmail.com"));
	    controller.save(new User(103L, "Ajay", "ajay@gmail.com"));
	    
	    //print those user
	    List<User> users = controller.findAll();
	    for(User u: users) {
	    	System.out.println(u.toString());
	    }
	    
	    //findById
	   // User user = controller.findById(102L);
	   // System.out.println(user.toString());
	    
	    //delete method
	   // controller.delete(101L);
	    
	    //update Method\
	    controller.update(103L, new User(103L, "Ajay kumar","Ahaya@gmail.com"));
	    
	    System.out.println("-----------After Update----------");
	  //print those user
	    List<User> users1 = controller.findAll();
	    for(User u: users1) {
	    	System.out.println(u.toString());
	    }
	}
}
