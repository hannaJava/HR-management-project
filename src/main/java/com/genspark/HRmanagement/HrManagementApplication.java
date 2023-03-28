package com.genspark.HRmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HrManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrManagementApplication.class, args);
	}

	//@Bean
	//public BCryptPasswordEncoder passwordEncoder() {
		//return new BCryptPasswordEncoder();
	//}

//	@Bean
//	public ApplicationRunner addData(UserRepoInt userRepo){
//		return args->{
//			if(userRepo.findByUsername("root")==null) {
//				userRepo.save(new User("root","root","root","root", Arrays.asList(new Role("admin"))));
//			}
//		};
//	}
}
