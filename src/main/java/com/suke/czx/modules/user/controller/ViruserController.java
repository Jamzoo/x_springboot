package com.suke.czx.modules.user.controller;

import com.suke.czx.common.utils.PageUtils;
import com.suke.czx.common.utils.Query;
import com.suke.czx.common.utils.R;
import com.suke.czx.modules.user.entity.UserEntity;
import com.suke.czx.modules.user.entity.ViruserEntity;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.suke.czx.modules.user.service.ViruserService;

import java.util.List;
import java.util.Map;

/**
 *  ziv
 *  虚拟用户类
 */
@RestController
@RequestMapping("/viruser")
public class ViruserController   {

    @Autowired
    private ViruserService viruserService;
    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("user:viruser:list")
    public R list(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        query.isPaging(true);
        List<ViruserEntity> viruserList = viruserService.queryList(query);
        PageUtils pageUtil = new PageUtils(viruserList, query.getTotle(), query.getLimit(), query.getPage());
        return R.ok().put("page", pageUtil);
    }
}
