package vn.edu.iuh.fit.controllers;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.models.Product;
import vn.edu.iuh.fit.services.ProductServices;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    private final ProductServices productServices;

    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAll(){
        List<Product> products = productServices.getAll();
        return ResponseEntity.ofNullable(products);
    }
}
