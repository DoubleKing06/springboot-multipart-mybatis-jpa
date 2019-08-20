/*
 * Copyright (c) 2019 tailflog.com All rights reserved.
 * 本软件源代码版权归----所有,未经许可不得任意复制与传播.
 */
package com.example.more.datasources.service;


import com.example.more.datasources.entity.tailflog.TailfLogs;

import java.util.List;

/**
 * TailfLogsService接口
 * @author kkliuliukunkun
 * @since 2019-07-04
 */
public interface TailfLogsService {
    List<TailfLogs> findAllByProjectId(Integer id) throws Exception;
}
