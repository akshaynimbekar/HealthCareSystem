package com.cg.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.hcs.entity.Appointment;

public interface AppointmentRepository extends JpaRepository <Appointment,Long> {

}
