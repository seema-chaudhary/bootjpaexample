package com.jps.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jps.test.dao.UserRepository;
import com.jps.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//	Saving Data***********************************	
//		User user =new User();
//		user.setName("Seema JPA");
//		user.setCity("Delhi");
//		user.setStatus("Java Programmer");
//		
//		User user1=userRepository.save(user); // storing single object
//		System.out.println(user1);
		
		// Saving Multiple Objects****************************************************
//		User user1 =new User();
//		user1.setName("Yogi JPA");
//		user1.setCity("Delhi");
//		user1.setStatus("Java Programmer");
//		
//		User user2 =new User();
//		user2.setName("Mayank JPA");
//		user2.setCity("Delhi");
//		user2.setStatus("Java Programmer");
//		
//		List<User> users = List.of(user1, user2);// java 9 method of()
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
//		Updating Data id-2**************************************
//		Optional<User> optional = userRepository.findById(2);
//		User user = optional.get();
//		user.setName("Yogesh");
//		User res = userRepository.save(user);
//		System.out.println(res);
		
//		Getting All Data using Old-Way **************************************
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		
//		while(iterator.hasNext())
//		{
//			User user = iterator.next();
//			System.out.println(user);
//		}

//		Getting All Data using New-Way-1 **************************************	
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(new Consumer<User>() 
//		{
//			@Override
//			public void accept(User t) {
//				System.out.println(t);	
//			}
//		});
	
//		Getting All Data using New-Way-2 **************************************	
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(user->System.out.println(user));// for single line printing
//		or
//		itr.forEach(user->{System.out.println(user);System.out.println("Bye");});//for multiple lines
	
//		Deleting the Element **************************************	
//		userRepository.deleteById(1);
		
//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(user->System.out.println(user));
//		userRepository.deleteAll(allusers);
		
		
//		We can create Custom Finder Methods/ Drived Query Method 
//		data by name
//		data by name and password
//		data name starting with prefix
//		data by name like 'keyword'
		
//		select * from User where name="something";
//		https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference
//		you needto create custom method like this
//		public List<User> findByName(String name); and call like below
		
//		List<User>  users= userRepository.findByName("Abhi");
//		users.forEach(e->System.out.println(e));
		
//		List<User> users= userRepository.findByNameAndCity("Abhi", "punjab");
//		users.forEach(e->System.out.println(e));
		
//		using custome query method
//		List<User> users = userRepository.getAllUserS();
//		users.forEach(e->System.out.println(e));
		
//		List<User> userByName = userRepository.getUserByNameS("Abhi");
//		userByName.forEach(e->System.out.println(e));
		
//		List<User> userByName = userRepository.getUserByNameCity("Abhi","punjab");
//		userByName.forEach(e->System.out.println(e));
		
		
		//calling native-query
		userRepository.getAllUsersSQL().forEach(e->System.out.println(e));
		
	}
}
