package com.genspark.HRmanagement;

import com.genspark.HRmanagement.repository.UserRepoInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Arrays;

@SpringBootApplication
@CrossOrigin("*")
public class HrManagementApplication {

	@Autowired
	private UserRepoInt userRepo;
	public static void main(String[] args) {
		SpringApplication.run(HrManagementApplication.class, args);
	}

	//@Bean
	//public BCryptPasswordEncoder passwordEncoder() {
		//return new BCryptPasswordEncoder();
	//}

	@Bean
	public ApplicationRunner addData(UserRepoInt userRepo){
		return args->{
			if(userRepo.findByUsername("root")==null) {
				userRepo.save(new User("root","root","root","root", Arrays.asList(new Role("admin"))));
			}
		};
	}


}
