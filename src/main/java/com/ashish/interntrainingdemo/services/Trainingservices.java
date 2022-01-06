package com.ashish.interntrainingdemo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ashish.interntrainingdemo.entity.Training;

@Service
public class Trainingservices {
	
	private List<Training> topicList=new ArrayList<>(Arrays.asList(
			new Training(1,"Java","2022-01-25","2022-01-27"),
			new Training(2,"JS","2022-01-25","2022-01-27"),
			new Training(3,"React","2022-01-25","2022-01-27"),
			new Training(4,"Enovia","2022-01-25","2022-01-27")
			));
	
	public List<Training> getAllTraining()
	{
		return topicList;
	}
	
	public Training getSpecificTraining(int id)
	{
		for (Training training : topicList) {
			if(training.getId()==id)
			{
				return training;
			}
		}
		return null;
	}

	//update training with id as parameter
	public Training updateTraining(int id,Training training)
	{
		for (int i = 0; i < topicList.size(); i++) {
			if(topicList.get(i).getId()==id)
			{
				topicList.set(i, training);
				return training;
			}
		}
		return null;
	}

	//add training
	public Training addTraining(Training training)
	{
//		increase id
		training.setId(topicList.size()+1);
		topicList.add(training);
		return training;
	}

	//delete training
	public int deleteTraining(int id)
	{
		for (int i = 0; i < topicList.size(); i++) {
			if(topicList.get(i).getId()==id)
			{
				topicList.remove(i);
				return 1;
			}
		}
		return 0;
	}

}
