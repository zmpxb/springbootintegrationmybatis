package com.xiaozl.springbootintegrationmybatis.service.impl;

import com.xiaozl.springbootintegrationmybatis.dao.CityDao;
import com.xiaozl.springbootintegrationmybatis.domain.City;
import com.xiaozl.springbootintegrationmybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
