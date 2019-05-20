package com.ilovecl.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ilovecl.demo.entity.Door;

@Mapper
@Repository
public interface DoorDao {
	//id
	Door queryById(String id);
	
	//name
	Door queryByName(String name);
	
	//upload
	void update(Door door);
	
	//add
	void add(Door door);
}
