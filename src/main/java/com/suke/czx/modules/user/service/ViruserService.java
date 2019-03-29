package com.suke.czx.modules.user.service;

import com.suke.czx.common.utils.Query;
import com.suke.czx.modules.user.entity.ViruserEntity;

import java.util.List;

public interface ViruserService {
    List<ViruserEntity> queryList(Query q);
}
