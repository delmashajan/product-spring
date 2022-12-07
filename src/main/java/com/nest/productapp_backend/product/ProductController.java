package com.nest.productapp_backend.product;

import com.nest.productapp_backend.dao.ProductDao;
import com.nest.productapp_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class ProductController {

    @Autowired
    private ProductDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json",produces = "application/json")
    public Map<String,String> Addproduct(@RequestBody Product p){

        System.out.println(p.getProductCode());
        System.out.println(p.getProductName().toString());
        System.out.println(p.getManufacturingDate().toString());
        System.out.println(p.getExpiryDate().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getPrize());
        System.out.println(p.getSellerName().toString());
        System.out.println(p.getDistributorName().toString());

        dao.save(p);
        HashMap<String,String> map = new HashMap<>();
        return map;
    }

    @CrossOrigin(origins = "*")

    @GetMapping("/view")
    public List<Product> Viewproduct(){
        return (List<Product>) dao.findAll();
    }

}
