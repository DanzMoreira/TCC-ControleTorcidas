package com.TCC.controleTorcidas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCC.controleTorcidas.model.ITimeRepository;
import com.TCC.controleTorcidas.model.Time;

@Service
public class TimeService {
	
	@Autowired
	private ITimeRepository rep;
	
	
	public Optional<Time> getTimeById(Long id_time) {
		
		return rep.findById(id_time);		
	}
	
	public Iterable<Time> getTime() {
		
		return rep.findAll();
		
	}
	
	public void postTime(Time time) {
		
		rep.save(time);
		
	}
	
	public void postTimes(List<Time> times) {
		
		rep.saveAll(times);
		
	}	
	

}
