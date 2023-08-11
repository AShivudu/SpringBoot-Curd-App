package com.shivudu.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivudu.model.SBIBank;

public interface SBIBankRepository extends JpaRepository<SBIBank, Serializable> {

}
