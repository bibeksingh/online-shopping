package com.bibek.onlineshoppingbackend.dao;

import java.util.List;

import com.bibek.onlineshoppingbackend.dto.Category;


public interface CategoryDao {
	
	List<Category> list();
	Category get(int id);
	

}
