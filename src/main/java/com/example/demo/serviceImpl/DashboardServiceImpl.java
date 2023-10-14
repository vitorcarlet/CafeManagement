package com.example.demo.serviceImpl;

import com.example.demo.DAO.BillDAO;
import com.example.demo.DAO.CategoryDAO;
import com.example.demo.DAO.ProductDAO;
import com.example.demo.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    CategoryDAO categoryDAO;

    @Autowired
    ProductDAO productDao;

    @Autowired
    BillDAO billDAO;
    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        Map<String,Object> map = new HashMap<>();
        map.put("category",categoryDAO.count());
        map.put("product", productDao.count());
        map.put("bill",billDAO.count());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
