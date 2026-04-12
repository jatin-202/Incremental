package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.CricketerDAO;
import com.edutech.progressive.service.CricketerService;
import com.edutech.progressive.entity.Cricketer;

public class CricketerServiceImplJdbc implements CricketerService {

    private CricketerDAO cricketerDAO;

    public CricketerServiceImplJdbc(CricketerDAO cricketerDAO) {
        this.cricketerDAO = cricketerDAO;
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        return new ArrayList<>();
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) {
        return -1;
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        return new ArrayList<>();
    }

    @Override
    public void updateCricketer(Cricketer cricketer) {
        // do nothing
    }

    @Override
    public void deleteCricketer(int cricketerId) {
        // do nothing
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
        return null;
    }
}