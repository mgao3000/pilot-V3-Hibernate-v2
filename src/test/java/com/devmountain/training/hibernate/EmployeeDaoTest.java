package com.devmountain.training.hibernate;

import com.devmountain.training.dao.EmployeeDao;
import com.devmountain.training.init.SpringBootAppInitializer;
import com.devmountain.training.entity.Account;
import com.devmountain.training.entity.Employee;
//import com.devmountain.training.entity.EmployeeDetail;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes= SpringBootAppInitializer.class)
public class EmployeeDaoTest {
    private Logger logger = LoggerFactory.getLogger(EmployeeDaoTest.class);

//    @Autowired
    private EmployeeDao employeeDao;

    private Employee employee;
//    private EmployeeDetail employeeDetail;
    private Account account1;
    private Account account2;

    private String employeeName;

    @BeforeClass
    public static void setupOnce() {
        //employeeDao = new EmployeeDaoImpl();
    }

    @Before
    public void setup() {
        employeeDao = new EmployeeDaoImpl();
        employeeName = "rhang";  //""xhuang";
    }

    @After
    public void teardown() {
        employeeDao = null;
    }

    @Test
    public void testFindAllEmployees() {
        List<Employee> employeeList = employeeDao.getEmployees();
        logger.info("###$$$@@@, the total employee size = {}", employeeList.size());
    }

    @Test
    public void testFindemployeeByName() {
        Employee employee = employeeDao.getEmployeeByName(employeeName);
        assertEquals(employeeName, employee.getName());
    }
}
