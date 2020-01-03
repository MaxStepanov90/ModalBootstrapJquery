package com.stepanov.services;

import com.stepanov.models.Nationality;
import com.stepanov.repository.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NationalityService {

    @Autowired
    private NationalityRepository nationalityRepository;

    public List<Nationality> getNationality() {
        return (List<Nationality>)nationalityRepository.findAll();
    }
    public Optional<Nationality>getNationalityById(Integer Id){
        return nationalityRepository.findById(Id);
    }
    public void addNationality(Nationality nationality){
        nationalityRepository.save(nationality);
    }
    public void updateNationality(Nationality nationality){
        nationalityRepository.save(nationality);
    }
    public void deleteById(Integer Id){
        nationalityRepository.deleteById(Id);
    }
}
