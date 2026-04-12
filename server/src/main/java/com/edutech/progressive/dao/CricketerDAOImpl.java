package com.edutech.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Cricketer;

public class CricketerDAOImpl implements CricketerDAO {

    @Override
    public int addCricketer(Cricketer cricketer) {
        return -1;
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
        return null;
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
    public List<Cricketer> getAllCricketers() {
        return new ArrayList<>();
    }
}