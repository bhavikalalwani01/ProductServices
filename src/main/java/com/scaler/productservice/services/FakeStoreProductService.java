package com.scaler.productservice.services;
import com.scaler.productservice.dtos.FakeStoreCreateProductDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import com.scaler.productservice.dtos.FakeStoreProductDto;
import com.scaler.productservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Primary
@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{

    @Autowired
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Product getSingleProduct(Long id) {
        FakeStoreProductDto responseDto =
                restTemplate.getForObject
                        ("https://fakestoreapi.com/products/" + id,
                                FakeStoreProductDto.class);
//        System.out.println("Hello Rohit");

        return responseDto.toProduct();
    }

    //    @Override
//    public Product addNewProduct(String title, String description, String image, double price, String category) {
//        FakeStoreCreateProductDto requestDto = new FakeStoreCreateProductDto();
//        requestDto.setTitle(title);
//        requestDto.setDescription(description);
//        requestDto.setImage(image);
//        requestDto.setPrice(price);
//        requestDto.setCategory(category);
//
//        FakeStoreProductDto responseDto = restTemplate.postForObject
//                ("https://fakestoreapi.com/products",
//                requestDto, FakeStoreProductDto.class);
//
//        return responseDto.toProduct();
//    }
    //--------
    @Override
    public Product addNewProduct(@RequestBody Product product) {
//    FakeStoreCreateProductDto requestDto = new FakeStoreCreateProductDto();
//    requestDto.setTitle(title);
//    requestDto.setDescription(description);
//    requestDto.setImage(image);
//    requestDto.setPrice(price);
//    requestDto.setCategory(category);
//
//    FakeStoreProductDto responseDto = restTemplate.postForObject
//            ("https://fakestoreapi.com/products",
//                    requestDto, FakeStoreProductDto.class);
//
//    return responseDto.toProduct();
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDto[] responseDto =
                restTemplate.getForObject("https://fakestoreapi.com/products",
                        FakeStoreProductDto[].class);

        List<Product> products = new ArrayList<>();
        for(FakeStoreProductDto dto : responseDto){
            products.add(dto.toProduct());
        }
        return products;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }




    @Override
    public void deleteProduct(Long id) {

    }
}