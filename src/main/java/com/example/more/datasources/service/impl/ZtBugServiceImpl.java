/*
 * Copyright (c) 2018 easyreport.com All rights reserved.
 * 本软件源代码版权归----所有,未经许可不得任意复制与传播.
 */
package com.example.more.datasources.service.impl;

import com.example.more.datasources.entity.zentao.ZtBug;
import com.example.more.datasources.mapper.zentao.ZtBugDao;
import com.example.more.datasources.service.ZtBugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ZtBugService 实现类
 * @author kkliu
 * @since 2018-10-30
 */
@Service("ztBugService")
public class ZtBugServiceImpl implements ZtBugService {
    @Autowired
    ZtBugDao ztBugDao;


    @Override
    public List<ZtBug> getBugListByModuleId(int moduleId) {
        return ztBugDao.getBugListByModuleId(moduleId);
    }
}
