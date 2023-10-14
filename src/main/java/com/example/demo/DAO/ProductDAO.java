package com.example.demo.DAO;

import com.example.demo.POJO.Product;
import com.example.demo.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductDAO extends JpaRepository<Product,Integer> {

    List<ProductWrapper> getAllProduct();

    @Modifying
    @Transactional
    Integer updateProductStatus(@Param("status")String status,@Param("id") int id);

    List<ProductWrapper> getProductByCategory(@Param("id")Integer id);

    ProductWrapper getProductById(@Param("id") Integer id);
}
