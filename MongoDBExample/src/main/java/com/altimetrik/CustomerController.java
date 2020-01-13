package com.altimetrik;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/customer")
public class CustomerController {

	/*
	 * @Autowired CustomerRepo customerRepo;
	 */
	@Autowired
	private CustomerRepo customerRepo;

	public void CustomerRepo(CustomerRepo userRepository) {
		this.customerRepo = userRepository;
	}

	@GetMapping("/data")
	public String welcomeUser() {
		return "<h1> welcome to mongo api</h1>";
	}

	@GetMapping("/all")
	public List<Customer> getAll() {
		System.out.println(customerRepo.count());
		return customerRepo.findAll();
	}

	@PostMapping("/save")
	public String addCustomer(@RequestBody Customer customer) {
		customerRepo.save(customer);
		return "data is added to mongo";

	}

	@GetMapping("/getById/{ids}")
	public Optional<Customer> addCustomer(@PathVariable int ids) {
		return customerRepo.findById(ids);

	}

	@DeleteMapping("/deleteById/{ids}")
	public String deleteCustomer(@PathVariable int ids) {
		customerRepo.deleteById(ids);
		return "customer is deleted ";

	}
}
