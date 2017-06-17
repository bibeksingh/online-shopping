package com.bibek.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bibek.onlineshoppingbackend.dao.CategoryDao;
import com.bibek.onlineshoppingbackend.dto.Category;


@Repository("categoryDao")
public class CategoryDAOImpl implements CategoryDao {
	
	private static List<Category> categories=new ArrayList<>();
	
	
	static
	{
		Category category=new Category();
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is the category for some television");
		category.setImageUrl("Cat_1.png");
		categories.add(category);
		
		//second category
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is the category for some mobile");
		category.setImageUrl("Cat_2.png");
		categories.add(category);
		
		//third category
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is the category for some Laptop");
		category.setImageUrl("Cat_3.png");
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		
		//enhance for loop
		for(Category category:categories)
		{
			if(category.getId()==id)
			{
				return category;
			}
		}
		return null;
	}

}
