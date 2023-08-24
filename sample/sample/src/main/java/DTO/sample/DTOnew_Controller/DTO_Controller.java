package DTO.sample.DTOnew_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import DTO.sample.DTOnew_DTO.DTO_DTO;
import DTO.sample.DTOnew_Entity.DTO_Entity;
import DTO.sample.DTOnew_Service.DTO_Service;

@RestController

public class DTO_Controller {
	
	@Autowired
	public DTO_Service staff_svc;
	
	@PostMapping("/add")
	public DTO_DTO Addemployee (@RequestBody DTO_Entity add_emp) {
		return staff_svc.Addemployee(add_emp);
	}
	
	@GetMapping("/get/{IDNo}")
	public DTO_Entity Getemployee(@PathVariable int IDNo) {
		return staff_svc.Getemployee(IDNo);
	}
	
	@GetMapping("/getall")
	
	public List<DTO_DTO> Getallemployee () {
	
		return staff_svc.getall();
	}
	
	@PutMapping("/update/{IDNo}")
	
	public DTO_DTO updatable(@RequestBody DTO_Entity value , @PathVariable int IDNo) {
		return staff_svc.update (value , IDNo);
	}
	

}