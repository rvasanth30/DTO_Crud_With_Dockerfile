package DTO.sample.DTOnee_Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import DTO.sample.DTOnew_Entity.DTO_Entity;

public interface DTO_Repo extends JpaRepository<DTO_Entity, Integer>{

}
