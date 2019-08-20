/*
 * Copyright (c) 2019 tailflog.com All rights reserved.
 * 本软件源代码版权归----所有,未经许可不得任意复制与传播.
 */
package com.example.more.datasources.mapper.tailflog;


import com.example.more.datasources.entity.tailflog.TailfLogs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * TailfLogsDao 接口
 * @author kkliuliukunkun
 * @since 2019-07-04
 */
@Mapper
public interface TailfLogsDao extends JpaRepository<TailfLogs,Integer> {
//    TailfLogs findById(int id);
//    //自定义扩展
//    List<TailfLogs>  findByServerNameAndIdNot(String serverName, int id);
//
//    List<TailfLogs> findAllByProjectId(Integer id);
//
//    List<TailfLogs> findAllByServerName(String serverName);





}
