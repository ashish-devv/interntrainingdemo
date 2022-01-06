package com.ashish.interntrainingdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ashish.interntrainingdemo.entity.Training;
import com.ashish.interntrainingdemo.services.Trainingservices;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Traingingendpoints {
	
	@Autowired
	private Trainingservices trainingservices; 
	
	@GetMapping("/training")
	public List<Training> getAllTraining()
	{
		return trainingservices.getAllTraining();
	}
	
	@GetMapping("/training/{id}")
	public Training getSpecificTraining(@PathVariable("id") int id)
	{
		return trainingservices.getSpecificTraining(id);

	}


	//api to add training
	@PostMapping("/training")
	public Training addTraining(@RequestBody Training training)
	{
		return trainingservices.addTraining(training);
	}


	//api to update training
	@PutMapping("/training/{id}")
	public Training updateTraining(@PathVariable("id") int id,@RequestBody Training training)
	{
		return trainingservices.updateTraining(id,training);

	}


	//api to delete training
	@DeleteMapping("/training/{id}")
	public int deleteTraining(@PathVariable("id") int id)
	{
		return trainingservices.deleteTraining(id);
	}

}
