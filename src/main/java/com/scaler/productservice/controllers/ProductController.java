package com.scaler.productservice.controllers;

import com.scaler.productservice.dtos.CreateProductRequestDto;
import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService){
        this.productService = productService;
    }

    // get all products
    @GetMapping
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }

    // get product by id
    @GetMapping("/{id}")
    public Product getProductDetails(@PathVariable("id") Long id){

        return productService.getSingleProduct(id);
    }

    // create product
    @PostMapping
    public  Product createProduct(@RequestBody Product product){
        return productService.addNewProduct(product);
    }
//    public Product createProduct(@RequestBody CreateProductRequestDto requestDto){
//        return productService.createProduct(
//                requestDto.getTitle(),
//            requestDto.getDescription(),
//            requestDto.getImage(),
//            requestDto.getPrice(),
//            requestDto.getCategory()
//        );
//    }

    // update product
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

    // delete product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }
}
