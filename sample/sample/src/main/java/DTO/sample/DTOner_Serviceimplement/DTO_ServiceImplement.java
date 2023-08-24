package DTO.sample.DTOner_Serviceimplement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DTO.sample.DTOnee_Repo.DTO_Repo;
import DTO.sample.DTOnew_DTO.DTO_DTO;
import DTO.sample.DTOnew_Entity.DTO_Entity;
import DTO.sample.DTOnew_Service.DTO_Service;


@Service

public  class DTO_ServiceImplement implements DTO_Service{
	
	@Autowired
	public DTO_Repo emp_repo;

	@Override
	public DTO_DTO Addemployee(DTO_Entity add_emp) {
		if(add_emp!= null) {
		DTO_DTO resultDTO= new DTO_DTO();
		resultDTO.setName(add_emp.getName());
		resultDTO.setDesignation(add_emp.getDesignation());
		resultDTO.setSalary(add_emp.getSalary());
		resultDTO.setLocation(add_emp.getLocation());
		
		emp_repo.save(add_emp);
		resultDTO.setMessage("Added ");
		resultDTO.setStatus(1);
		return resultDTO;
		
		}
		else {
			DTO_DTO resultDTO=new DTO_DTO();
			resultDTO.setMessage("Adding failed");
			resultDTO.setStatus(0);
			return resultDTO;
		}
		
	}

	@Override
	public DTO_Entity Getemployee(int IDNo) {
		DTO_Entity getdto = emp_repo.findById(IDNo).orElse(null);
		return getdto;
	}
	
	@Override
	public List <DTO_DTO> getall(){
		List <DTO_Entity> getallvalues = emp_repo.findAll();
		List <DTO_DTO> myvalues=new ArrayList<DTO_DTO>();
		for (DTO_Entity value1:getallvalues) {
			
			myvalues.add(this.getempDTO(value1));
		}
		return myvalues;
	}
	
	private DTO_DTO getempDTO(DTO_Entity value1) {
		// TODO Auto-generated method stub
		DTO_DTO value3=new DTO_DTO();
		value3.setIDNo(value1.getIDNo());
		value3.setName(value1.getName());
		value3.setDesignation(value1.getDesignation());
		value3.setLocation(value1.getLocation());
		value3.setSalary(value1.getSalary());
		value3.setMessage("existed");
		value3.setStatus(1);
		
		return value3;
	}

	@Override
	public DTO_DTO update (DTO_Entity value , int IDNo) {
		DTO_Entity updating=emp_repo.findById(IDNo).orElse(null);
		DTO_DTO result=new DTO_DTO();
		if (updating != null) {
			updating.setName(value.getName());
			updating.setDesignation(value.getDesignation());
			updating.setSalary(value.getSalary());
			updating.setLocation(value.getLocation());
			
			DTO_Entity updated = emp_repo.save(updating);
			
			
			
			result.setIDNo(updated.getIDNo());
			result.setName(updated.getName());
			result.setLocation(updated.getLocation());
			result.setDesignation(updated.getDesignation());
			result.setSalary(updated.getSalary());
			result.setMessage("updated");
			result.setStatus(1);
			
	        return result;
			
		}
		else {
			
			
			result.setMessage("not updated");
			result.setStatus(0);
			return result;
			
		}
			
		
	
	}

	
	
	
}

	


