package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Cricketer;
import com.edutech.progressive.repository.CricketerRepository;
import com.edutech.progressive.service.CricketerService;

@Service
public class CricketerServiceImplJpa  implements CricketerService  {

    @Autowired
    CricketerRepository cricketerRepository;
    
    public CricketerServiceImplJpa(CricketerRepository cricketerRepository) {
        this.cricketerRepository = cricketerRepository;
    }

    List<Cricketer> list= new ArrayList<>();
    @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
    
        return cricketerRepository.findAll();
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) throws SQLException {
       //return -1;
    //    return cricketerRepository.save(cricketer).getCricketerId();
     if (cricketer.getTeam() != null) {
        cricketer.setTeamId(cricketer.getTeam().getTeamId());
    }
    return cricketerRepository.save(cricketer).getCricketerId();

    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        List<Cricketer> cricketers = cricketerRepository.findAll();
        cricketers.sort(Comparator.comparing(Cricketer::getExperience));
        return cricketers;
    }
     public void updateCricketer(Cricketer cricketer) throws SQLException{

        Cricketer c= cricketerRepository.findById(cricketer.getCricketerId()).get();
        c.setTeamId(cricketer.getTeamId());
        c.setCricketerId(cricketer.getCricketerId());
        c.setCricketerName(cricketer.getCricketerName());
        c.setAge(cricketer.getAge());
        c.setExperience(cricketer.getExperience());
        c.setNationality(cricketer.getNationality());
        c.setTotalRuns(cricketer.getTotalRuns());
        c.setTotalWickets(cricketer.getTotalWickets());
        cricketerRepository.save(c);

     }

    public void deleteCricketer(int cricketerId) throws SQLException{

        cricketerRepository.deleteById(cricketerId);
    }

    public Cricketer getCricketerById(int cricketerId)throws SQLException {
    
        return cricketerRepository.findByCricketerId(cricketerId);

    }

    //Do not implement these methods in CricketerServiceImplArraylist.java and CricketerServiceImplJdbc.java class
    public List<Cricketer> getCricketersByTeam(int teamId) throws SQLException {
        return cricketerRepository.findByTeamId(teamId);
    }



}