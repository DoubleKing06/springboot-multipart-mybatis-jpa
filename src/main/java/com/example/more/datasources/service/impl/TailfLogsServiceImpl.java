/*
 * Copyright (c) 2019 tailflog.com All rights reserved.
 * 本软件源代码版权归----所有,未经许可不得任意复制与传播.
 */
package com.example.more.datasources.service.impl;

import com.example.more.datasources.entity.tailflog.TailfLogs;
import com.example.more.datasources.mapper.tailflog.TailfLogsDao;
import com.example.more.datasources.service.TailfLogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * TailfLogsService 实现类
 * @author kkliuliukunkun
 * @since 2019-07-04
 */
@Service("tailfLogsService")
public class TailfLogsServiceImpl implements TailfLogsService {
	private static final Logger lg  = LoggerFactory.getLogger(TailfLogsServiceImpl.class);
	@Resource private TailfLogsDao tailfLogsDao;

	@Override
	public List<TailfLogs> findAllByProjectId(Integer id) throws Exception {
		if (id<1){
			throw new Exception("id不正确");
		}
		return tailfLogsDao.findAll();
	}
}
