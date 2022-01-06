package com.ashish.interntrainingdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.interntrainingdemo.entity.Training;

public interface Trainingrepo extends JpaRepository<Training, Integer>{

}
