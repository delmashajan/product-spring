package com.nest.productapp_backend.product;

import org.springframework.web.bind.annotation.GetMapping;
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
    @PostMapping("/edit")
    public String Editproduct(){
        return "edit product details";
    }
    @GetMapping("/view")
    public String Viewproduct(){
        return "view product details";
    }
    @PostMapping("/delete")
    public String Deleteproduct(){
        return "delete product";
    }
}
