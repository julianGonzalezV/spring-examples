package com.springbdpy.service.impl;

import com.springbdpy.beans.ShirtBrand;
import com.springbdpy.dao.impl.ShirtBrandDaoImpl;
import com.springbdpy.service.interfaces.ShirtBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShirtBrandServiceImp implements ShirtBrandService {

    @Autowired
    private ShirtBrandDaoImpl shirtBrandDao;

    @Override
    public void insert(ShirtBrand brand) throws Exception {
        try {
            shirtBrandDao.insert(brand);
        }catch (Exception e){
            throw e;
        }

    }
}
