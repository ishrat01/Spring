package com.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.glass.ui.Application;
 
@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	private UserDTO dtoRef;
	
	{
    	dtoRef = new UserDTO();
    	dtoRef.setEmail("abc@xyz.com");
	}
	
	
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
    	System.out.println("inside GET");
/*        UserDTO userForm = new UserDTO();    
        
        userForm.setUsername("dummy");
        model.put("userForm", userForm);
*/      
        List<String> professionList = new ArrayList<String>();
        professionList.add("Developer");
        professionList.add("Designer");
        professionList.add("IT Manager");
        model.put("professionList", professionList);
         
        
        System.out.println(model.getClass());
//        return "redirect:registration";
        return "registration";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") UserDTO UserDTO) {
    	System.out.println("inside POST");
        // implement your own registration logic here...
         
        // for testing purpose:
    	
    	System.out.println(UserDTO.getClass());
    	
        System.out.println("username: " + UserDTO.getUsername());
        System.out.println("password: " + UserDTO.getPassword());
        System.out.println("email: " + UserDTO.getEmail());
        System.out.println("birth date: " + UserDTO.getBirthDate());
        System.out.println("profession: " + UserDTO.getProfession());
         
//        return "redirect:/WEB-INF/pages/success.jsp";
        return "success";
    }
    
    @ModelAttribute("userForm")
    UserDTO createUser(){
    	System.out.println("TRYING TO CREATE AN ENTRY FOR A USER");
    	return dtoRef;
    }
    
}