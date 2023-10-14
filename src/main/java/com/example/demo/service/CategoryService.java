package com.example.demo.service;

import com.example.demo.POJO.Category;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface CategoryService {

    ResponseEntity<String> addNewCategory(Map<String,String> requestMap);

    ResponseEntity<List<Category>> getAllCategory(String filterValue);

    ResponseEntity<String> updateCategory(Map<String,String> requestMap);

}
