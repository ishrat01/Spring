package com.flp.ems.view;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.*;
import com.flp.ems.dao.EmployeeDaoImplForList;

@Controller
@RequestMapping("/controller")
public class MyController {

//	@Autowired
//	private EmployeeDaoImplForList empDAO;

	private static final String ACTION_KEY = "action";
	private static final String VIEW_CAR_LIST_ACTION = "view";
	private static final String ADD_CAR_ACTION = "addCar";
	private static final String SAVE_CAR_ACTION = "save";
	private static final String EDIT_CAR_ACTION = "editCar";
	private static final String DELETE_CAR_ACTION = "deleteCar";
	private static final String ERROR_KEY = "errorMessage";

	@RequestMapping(method = RequestMethod.GET)
	String viewAllCars(@RequestParam("action") String action, ModelMap map) {
		System.out.println(action);
		
		if(VIEW_CAR_LIST_ACTION.equals(action)){
			
			return "addEmployee";
		}
		
		return "addEmmmmployee";
	}
	
	@ModelAttribute("list")
	public HashMap<String,String>[] getCarList(){
		System.out.println("Got cars from repository");
		return new EmployeeServiceImpl().getAllEmployee() ;
	}
	
	
	
	@ModelAttribute("addEmp")
	public Employee getCar(){
		System.out.println("Created employee in memory");
		return new Employee() ;
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String saveCar(@ModelAttribute("addEmp") Employee addEmp, @RequestParam("action") String action, ModelMap map){
		if(SAVE_CAR_ACTION.equals(action)){
			System.out.println("Employee added is"+addEmp.getName()+"Date is"+addEmp.getDob());
			new EmployeeServiceImpl().addEmployeePhase4(addEmp);
		}
		
		return "viewAll";
	}
	
	
	
}
