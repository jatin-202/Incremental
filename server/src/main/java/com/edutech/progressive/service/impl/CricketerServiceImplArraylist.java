package com.edutech.progressive.service.impl;

import com.edutech.progressive.service.CricketerService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.edutech.progressive.entity.Cricketer;;;

public class CricketerServiceImplArraylist implements CricketerService {
    private List<Cricketer> cricketers = new ArrayList<>();

    @Override
    public List<Cricketer> getAllCricketers() {
        return cricketers;
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) {
        cricketers.add(cricketer);
        return 1; // success
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        List<Cricketer> sortedList = new ArrayList<>(cricketers);

        sortedList.sort(Comparator.comparingInt(Cricketer::getExperience));

        return sortedList;
    }

    @Override
    public void emptyArrayList() {
        cricketers.clear();
    }
}
