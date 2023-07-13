package com.javapractice.dao.doctor;

import com.javapractice.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
