package DTO.sample.DTOnew_Service;

import java.util.List;

import DTO.sample.DTOnew_DTO.DTO_DTO;
import DTO.sample.DTOnew_Entity.DTO_Entity;

public interface DTO_Service  {
	

	

	

	public DTO_DTO Addemployee(DTO_Entity add_emp);

	public DTO_Entity Getemployee(int IDNo);
	
	

	public List<DTO_DTO> getall();

	public DTO_DTO update(DTO_Entity value, int IDNo);
	
	
	

	
}

