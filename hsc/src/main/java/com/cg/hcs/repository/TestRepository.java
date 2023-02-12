package com.cg.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.hcs.entity.MedicalTest;

public interface TestRepository extends JpaRepository<MedicalTest,Integer>{

}
