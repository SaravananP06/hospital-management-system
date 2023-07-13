package com.javapractice.controller.doctor;

import com.javapractice.model.doctor.Doctor;
import com.javapractice.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService service;
    @GetMapping("/doctors")
    public List<Doctor> getDoctor(){
        return service.getDoctor();
    }
}
