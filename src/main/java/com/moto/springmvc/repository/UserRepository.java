package com.moto.springmvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.moto.springmvc.model.User;


public interface UserRepository extends  CrudRepository< User, Long>{

	List<User> findAll();

	User findById(int id);
}