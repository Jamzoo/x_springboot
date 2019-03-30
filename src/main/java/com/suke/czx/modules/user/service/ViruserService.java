package com.suke.czx.modules.user.service;

import com.suke.czx.common.utils.Query;
import com.suke.czx.modules.user.entity.ViruserEntity;

import java.util.HashMap;
import java.util.List;

public interface ViruserService {
    List<ViruserEntity> queryList(HashMap<String,Object> map);
}
