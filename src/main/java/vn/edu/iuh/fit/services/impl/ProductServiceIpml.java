package vn.edu.iuh.fit.services.impl;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.models.Product;
import vn.edu.iuh.fit.repositories.ProductRepository;
import vn.edu.iuh.fit.services.ProductServices;

import java.util.List;
@Service
public class ProductServiceIpml implements ProductServices {
    private final ProductRepository productRepository;

    public ProductServiceIpml(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
