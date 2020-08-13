package com.service;

import java.util.List;

import com.model.Classes;

public interface ClassService {
	
	public Classes createClass(Classes classes);
	public Classes getClassId(int id);
	public List<Classes> getAllClass();
	public void removeClass(int id);
	public Classes updateClass(Classes classes);
	

}
