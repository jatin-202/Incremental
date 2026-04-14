package com.edutech.progressive.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.edutech.progressive.entity.Cricketer;
@Repository
public interface CricketerRepository extends JpaRepository<Cricketer,Integer> {
public Cricketer findByCricketerId(int cricketerId);
 public List<Cricketer>findByTeamId(int teamId);
 public List<Cricketer>findByOrderByExperienceDesc();

    @Modifying
@Transactional
public void deleteByTeamId(int teamId);

}