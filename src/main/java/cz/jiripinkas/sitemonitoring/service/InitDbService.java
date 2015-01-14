package cz.jiripinkas.sitemonitoring.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.jiripinkas.sitemonitoring.entity.Check;
import cz.jiripinkas.sitemonitoring.repository.CheckRepository;

@Service
public class InitDbService {

	@Autowired
	private CheckRepository checkRepository;

	@PostConstruct
	public void init() {
		System.out.println("*** INIT DATABASE START ***");
		{
			Check check = new Check();
			check.setName("example");
			check.setUrl("http://www.example.com");
			checkRepository.save(check);
		}
		{
			Check check = new Check();
			check.setName("sitemonitoring");
			check.setUrl("http://sitemonitoring.sourceforge.net");
			checkRepository.save(check);
		}
		{
			Check check = new Check();
			check.setName("javavids");
			check.setUrl("http://www.javavids.com");
			checkRepository.save(check);
		}
		System.out.println("*** INIT DATABASE FINISH ***");
	}
}
