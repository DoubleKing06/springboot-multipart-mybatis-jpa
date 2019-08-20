package com.example.more.datasources.mapper.zentao;

import com.example.more.datasources.entity.zentao.BugInfo;
import com.example.more.datasources.entity.zentao.ZtBug;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZtBugDao {

    /**
     * 通过BuildID 获取此模块的Bug统计数据
     * @param buildId
     * @return
     */
    List<BugInfo> getBugInfoByBuildId(@Param("buildId") int buildId);

    /**
     * 通过BuildID 获取此模块的Bug详细信息
     * @param buildId
     * @return
     */
    List<ZtBug> getBugListByModuleId(@Param("buildId") int buildId);

    /**
     * 通过ModuleID 获取此模块的Bug统计数据
     * @param moduleIdList
     * @return
     */
    List<BugInfo> getBugInfoByModuleId(@Param("moduleIdList") List moduleIdList);

    /**
     * 通过ModuleID 获取此模块的Bug详细信息
     * @param moduleList
     * @return
     */
    List<ZtBug> getBugListByModuleId(@Param("moduleIdList") List<Long> moduleList);



}
