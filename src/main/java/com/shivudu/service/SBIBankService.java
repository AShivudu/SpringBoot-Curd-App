package com.shivudu.service;

import java.util.List;

import com.shivudu.model.SBIBank;

public interface SBIBankService {

	public String savedata(SBIBank sbibank);

	public List<SBIBank> findAll();

	public String updatedata(SBIBank sbibank);

	public String deleteById(Integer id);

	public String deleteAll();

}
