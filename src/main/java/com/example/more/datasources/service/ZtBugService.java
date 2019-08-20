/*
 * Copyright (c) 2018 easyreport.com All rights reserved.
 * 本软件源代码版权归----所有,未经许可不得任意复制与传播.
 */
package com.example.more.datasources.service;

import com.example.more.datasources.entity.zentao.ZtBug;

import java.util.List;

/**
 * ZtBugService接口
 * @author kkliu
 * @since 2018-10-30
 */
public interface ZtBugService {


    /**
     * 通过模块ID获取Bug信息
     * @return
     */
    List<ZtBug> getBugListByModuleId(int moduleId);



}
