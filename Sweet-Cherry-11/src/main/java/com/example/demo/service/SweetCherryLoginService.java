package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.SweetCherryLogin;
import com.example.demo.repository.SweetCherryLoginRepo;

@Service
public class SweetCherryLoginService {
	@Autowired
	private SweetCherryLoginRepo repo;
	
	public SweetCherryLogin login(SweetCherryLogin login) {
		List<SweetCherryLogin> logins=getLogins(login);
		for(SweetCherryLogin sweetCherryLogin:logins) {
			if(sweetCherryLogin.getPassword().equals(login.getPassword())) {
				return sweetCherryLogin;
			}
		}
		return new SweetCherryLogin();
	}
	
	private List<SweetCherryLogin> getLogins(SweetCherryLogin login){
		List<SweetCherryLogin> logins=repo.search(login.getEmail().toLowerCase());
		return logins;
	}
	
	public SweetCherryLogin add(SweetCherryLogin login) {
		List<SweetCherryLogin> logins=getLogins(login);
		if(logins==null || logins.isEmpty()) {
			login.setEmail(login.getEmail().toLowerCase());
			login=repo.save(login);
			return login;
		}
		return null;
	}
}
