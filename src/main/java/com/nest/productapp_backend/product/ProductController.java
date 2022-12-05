package com.nest.productapp_backend.product;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
    @PostMapping("/")
    public String Addproduct(){
        return "add product details";
    }
    @PostMapping("/search")
    public String Searchproduct(){
        return "search product details";
    }
}
