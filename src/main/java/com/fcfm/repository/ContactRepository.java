package com.fcfm.repository;

import java.io.Serializable;

import com.fcfm.entity.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("contactRepository")
public interface ContactRepository extends JpaRepository<Contact , Serializable> {

    public abstract Contact findById(int id);

}