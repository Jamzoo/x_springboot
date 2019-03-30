package com.suke.czx.modules.user.service.impl;


import com.suke.czx.modules.user.dao.ViruserDao;
import com.suke.czx.modules.user.entity.ViruserEntity;
import com.suke.czx.modules.user.service.ViruserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service("viruserService")
public  class ViruserServiceImpl implements ViruserService {
    @Autowired
    private ViruserDao viruserDao;

    public List<ViruserEntity> queryList(HashMap<String,Object> map){
        System.out.println(map);
        return viruserDao.queryList(map);
    }
}
