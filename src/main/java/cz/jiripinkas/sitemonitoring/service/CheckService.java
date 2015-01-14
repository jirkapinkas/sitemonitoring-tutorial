package cz.jiripinkas.sitemonitoring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.jiripinkas.sitemonitoring.entity.Check;
import cz.jiripinkas.sitemonitoring.repository.CheckRepository;

@Service
public class CheckService {

	@Autowired
	private CheckRepository checkRepository;
	
	public List<Check> findAll() {
		return checkRepository.findAll();
	}

	public void save(Check check) {
		checkRepository.save(check);
	}

	public void remove(Check check) {
		checkRepository.delete(check);
	}

}
