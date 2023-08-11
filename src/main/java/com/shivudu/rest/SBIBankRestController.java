package com.shivudu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivudu.model.SBIBank;
import com.shivudu.service.SBIBankService;

@RestController
public class SBIBankRestController {

	@Autowired
	private SBIBankService service;

	@PostMapping("/save")
	public String savedata(@RequestBody SBIBank sbibank) {
		return service.savedata(sbibank);
	}

	@GetMapping("/findAll")
	public List<SBIBank> findAll() {
		return service.findAll();
	}

	@PostMapping("/update")
	public String updatedata(@RequestBody SBIBank sbibank) {
		return service.updatedata(sbibank);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable Integer id) {
		return service.deleteById(id);
	}

	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		return service.deleteAll();

	}

}
