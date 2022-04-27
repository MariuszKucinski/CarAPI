package com.mariuszkucinski.carapi.serviceimpl;

import com.mariuszkucinski.carapi.entity.Brand;
import com.mariuszkucinski.carapi.repository.BrandRepository;
import com.mariuszkucinski.carapi.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository){
        this.brandRepository = brandRepository;
    }


    @Override
    public void addBrand(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public void editBrand(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(int id) {
        brandRepository.deleteById(id);
    }

    @Override
    public Brand getBrandById(int id) {
        return brandRepository.getById(id);
    }

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }
}
