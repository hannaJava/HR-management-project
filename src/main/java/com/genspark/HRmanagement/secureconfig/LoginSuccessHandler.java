//package com.genspark.HRmanagement.secureconfig;
//
//import com.genspark.HRmanagement.model.User;
//import com.genspark.HRmanagement.repository.UserRepoInt;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//
//
//@Component
//public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
//
//
//	@Autowired
//	private UserRepoInt userRepo;
//
//	 @Autowired HttpSession session; //autowiring session
//
//	 private static final Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//            Authentication authentication) throws ServletException, IOException {
//
//    	 UserDetails userDetails = (UserDetails) authentication.getPrincipal();
//         String username = userDetails.getUsername();
//
//    	User user=userRepo.findByUsername(username);
//
//        String redirectURL = request.getContextPath();
//
//        if ( user.hasRole("employee")) {
//            redirectURL = "employee";
//        } else if (user.hasRole("admin")) {
//            redirectURL = "admin";
//        }
//
//        response.sendRedirect(redirectURL);
//
//         logger.info("current sesssion username is : " + username);
//        //HttpSession session = request.getSession();
//        session.setAttribute("user", user);
//        System.out.println(" session attribute "+session.getAttribute("user"));
//    }
//
//}