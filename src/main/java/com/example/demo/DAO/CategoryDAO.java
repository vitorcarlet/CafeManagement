package com.example.demo.DAO;

import com.example.demo.POJO.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDAO extends JpaRepository<Category,Integer> {

    List<Category> getAllCategory();

}
