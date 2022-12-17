package demo.testexample.feign.util;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import demo.testexample.model.CustomerModel;

@FeignClient(value = "serverService",url = "http://localhost:8080/customer")
public interface FeignServiceutil {

	@GetMapping("/getall")
	public List<CustomerModel> getAllCustomer1();
	
	@PostMapping("/post")
	public CustomerModel postCustomer(@RequestBody CustomerModel c);
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable Integer id);
	
	
	@PutMapping("/put/{id}")
	public String updateCustomer(@PathVariable Integer id,@RequestBody CustomerModel e);
	@GetMapping("/getbyname")
	public List<CustomerModel> getAllCustomer();
	
	
	
	
	
}
