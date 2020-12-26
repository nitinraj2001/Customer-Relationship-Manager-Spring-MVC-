package mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mypack.entity.Customer;

import mypack.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService thecustomerservice;
	
	@RequestMapping("/list")
	public String sendToCustomerList(Model themodel) {
		
		List<Customer> thecustomers=thecustomerservice.getCustomers();
		
		themodel.addAttribute("customers", thecustomers);
		
		return "customer-list";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		
		Customer thecustomer=new Customer();
		
		model.addAttribute("customer", thecustomer);
		
		return "customer-form";
		
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer thecustomer) {
		
		thecustomerservice.saveCustomer(thecustomer);
		
		return "redirect:/customer/list";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int customer_Id,Model theModel) {
		
		Customer thecustomer=thecustomerservice.getCustomer(customer_Id);
		
		theModel.addAttribute("customer", thecustomer);
		
		return "customer-form";
	}
	
	@GetMapping("/download")
	public String download() {
		
		return "download";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int customer_Id) {
		
		thecustomerservice.deleteCustomer(customer_Id);
		
		return "redirect:/customer/list";
	}

}
