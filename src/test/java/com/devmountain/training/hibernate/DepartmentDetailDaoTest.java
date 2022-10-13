package com.devmountain.training.hibernate;

import com.devmountain.training.dao.DepartmentDao;
import com.devmountain.training.dao.DepartmentDetailDao;
import com.devmountain.training.entity.Department;
import com.devmountain.training.entity.DepartmentDetail;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DepartmentDetailDaoTest {
    private Logger logger = LoggerFactory.getLogger(DepartmentDetailDaoTest.class);

    private static DepartmentDetailDao departmentDetailDao;
    private static DepartmentDao departmentDao;

    private String deptName;
    private DepartmentDetail dd;
    private Department dept;

    @BeforeClass
    public static void setupOnce() {
        departmentDetailDao = new DepartmentDetailDaoImpl();
        departmentDao = new DepartmentDaoImpl();
    }

    @Before
    public void setup() {
        deptName = "HR-Test1";

        dept = new Department();
        dept.setName(deptName);
        dept.setDescription(deptName + " description");
        dept.setLocation("Fairfax, VA");

        dd = new DepartmentDetail();
        dd.setDescription("DD description");
        dd.setRevenue(200000);
        dd.setSize(1000);

        dept.setDepartmentDetail(dd);
        dd.setDepartment(dept);

        departmentDao.save(dept);
//        departmentDetailDao.save(dd);
    }

    @After
    public void teardown() {
        departmentDao.delete(dept);
//        departmentDetailDao.delete(dd);
    }

    @Test
    public void getDepartmentDetailsTest() {;
        List<DepartmentDetail> departmentDetailList = departmentDetailDao.getDepartmentDetails();
        assertEquals(5, departmentDetailList.size());
    }
}
