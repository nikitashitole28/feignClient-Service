package demo.testexample.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.testexample.feign.util.FeignServiceutil;
import demo.testexample.model.CustomerModel;

@RestController
@RequestMapping("customer")
public class CustomerControllers {
	
     @Autowired
	private FeignServiceutil feignServiceutil;
	
@GetMapping("/getall")
public List<CustomerModel> getAllCustomer1(){
	return feignServiceutil.getAllCustomer();
}

@PostMapping("/post")
public CustomerModel postCustomers(@RequestBody CustomerModel c) {
	CustomerModel postCustomer = feignServiceutil.postCustomer(c);
	return postCustomer;
}

@DeleteMapping("/delete/{id}")
public String deleteCustomers(@PathVariable Integer id) {
	String deleteCustomer = feignServiceutil.deleteCustomer(id);
	return deleteCustomer;
}


@PutMapping("/put/{id}")
public String updateCustomers(@PathVariable Integer id,@RequestBody CustomerModel e) {
	String updateCustomer = feignServiceutil.updateCustomer(id, e);
	return updateCustomer;
	
}
@GetMapping("/getbyname")
public List<CustomerModel> getAllCustomer(){
	return feignServiceutil.getAllCustomer1();
}

	
}
