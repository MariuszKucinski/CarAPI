package com.mariuszkucinski.carapi.service;

import com.mariuszkucinski.carapi.entity.Brand;

import java.util.List;

public interface BrandService {
    void addBrand(Brand brand);
    void editBrand(Brand brand);
    void deleteBrand(int id);
    Brand getBrandById(int id);
    List<Brand> getAllBrands();
}
