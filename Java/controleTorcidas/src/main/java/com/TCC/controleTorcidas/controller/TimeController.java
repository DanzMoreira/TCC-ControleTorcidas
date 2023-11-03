package com.TCC.controleTorcidas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TCC.controleTorcidas.model.Time;
import com.TCC.controleTorcidas.service.TimeService;

@RestController
@RequestMapping("/time")
public class TimeController {
	
	@Autowired
	TimeService service;
	
	
	@GetMapping("/{id}")
	public Optional<Time> getTimeById(@PathVariable("id") Long id_time) {		
		return service.getTimeById(id_time);		
	}
	
	@GetMapping
	public Iterable<Time> getTime(Long id_time) {		
		return service.getTime();		
	}
	
	@PostMapping
	public void postTime(@RequestBody Time time) {		
		service.postTime(time);		
	}
	
	@PostMapping("/cargaTimes")
	public void postTimes(@RequestBody List<Time> time) {		
		service.postTimes(time);		
	}
	
	

}
