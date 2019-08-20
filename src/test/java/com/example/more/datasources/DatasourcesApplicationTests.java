package com.example.more.datasources;

import com.example.more.datasources.mapper.tailflog.TailfLogsDao;
import com.example.more.datasources.mapper.zentao.ZtBugDao;
import org.hibernate.annotations.Source;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatasourcesApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    protected TailfLogsDao tailfLogsDao;

    @Autowired
    private ZtBugDao ztBugDao;


    @Test
    public void test() throws Exception {
        System.out.println("=============="+tailfLogsDao.findAll());
        System.out.println("=============="+ztBugDao.getBugInfoByBuildId(43));
    }



}
