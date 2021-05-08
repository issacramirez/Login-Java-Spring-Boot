package com.fcfm.repository;

import java.io.Serializable;

import com.fcfm.entity.Log;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("logRepository")
public interface LogRepository extends JpaRepository<Log , Serializable> {

}