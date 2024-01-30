package com.firstproject.web.repository;


import com.firstproject.web.model.FormInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammerRepo extends JpaRepository<FormInfo, Integer> {

}
