package com.javapractice.service.doctor;

import com.javapractice.dao.doctor.DoctorRepository;
import com.javapractice.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository repository;

    public void initDoctor(){
        repository.saveAll(Stream.of(new Doctor(101,"Vishnu","Cancer Specialist"),
                new Doctor(102,"Vishwakarma","Cardiac")).collect(Collectors.toList()));
    }

    public List<Doctor> getDoctor(){
        return repository.findAll();
    }

}
