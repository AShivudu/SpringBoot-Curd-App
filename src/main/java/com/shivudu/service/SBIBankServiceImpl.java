package com.shivudu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivudu.model.SBIBank;
import com.shivudu.repository.SBIBankRepository;

@Service
public class SBIBankServiceImpl implements SBIBankService {

	@Autowired
	private SBIBankRepository repository;

	@Override
	public String savedata(SBIBank sbibank) {
		repository.save(sbibank);
		return "Customer Recored Saved Successfully";
	}

	@Override
	public List<SBIBank> findAll() {
		return repository.findAll();
	}

	@Override
	public String updatedata(SBIBank sbibank) {
		repository.save(sbibank);
		return "Customer Recored Updated Successfully";
	}

	@Override
	public String deleteById(Integer id) {
		repository.deleteById(id);
		return "Customer OneRecored Deleted Successfully";
	}

	@Override
	public String deleteAll() {
		repository.deleteAll();
		return "AllCustomer's Recoreds Deleted Successfully";
	}

}
