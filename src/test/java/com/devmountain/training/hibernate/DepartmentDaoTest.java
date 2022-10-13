package com.devmountain.training.hibernate;

import com.devmountain.training.dao.DepartmentDao;
import com.devmountain.training.init.SpringBootAppInitializer;
import com.devmountain.training.entity.Account;
import com.devmountain.training.entity.Department;
import com.devmountain.training.entity.DepartmentDetail;
import com.devmountain.training.entity.Employee;
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

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes= SpringBootAppInitializer.class)
public class DepartmentDaoTest {
    private Logger logger = LoggerFactory.getLogger(DepartmentDaoTest.class);

//    @Autowired
    private DepartmentDao departmentDao;

    private Department testDept;
    private String deptName;
    private Employee emp1;
    private Employee emp2;
    private Account acct1;
    private Account acct2;

    private DepartmentDetail deptDetail;

    @BeforeClass
    public static void setupOnce() {

        //departmentDao = new DepartmentDaoImpl();
    }

    @Before
    public void setup() {
        departmentDao = new DepartmentDaoImpl();
        deptName = "HR-Test";
        /*
        Logic 1: create a department
        Logic 2. create two employees
        Logic 3. add two employees to the department
        Logic 4. use departmentDao to save department. Attention: the associated
                 two employees are saved too due to cascade saving feature
         */
        testDept = new Department();
        testDept.setName(deptName);
        testDept.setDescription(deptName + " description");
        testDept.setLocation("Fairfax, VA");

        emp1 = new Employee();
        emp1.setName("Zhang3");
        emp1.setAddress("123 Road, VA");
        emp2 = new Employee();
        emp2.setName("Li4");
        emp2.setAddress("456 Road, VA");

        acct1 = new Account();
        acct1.setAccountType("emp1-acct-type");
        acct1.setBalance(BigDecimal.valueOf(10001.1));

//        emp1.getAccounts().add(acct1);
//        acct1.setEmployee(emp1);
        emp1.addAccount(acct1);

//        testDept.getEmployees().add(emp1);
//        emp1.setDepartment(testDept);
        testDept.addEmployee(emp1);

//        testDept.getEmployees().add(emp2);
//        emp2.setDepartment(testDept);
        testDept.addEmployee(emp2);

        acct2 = new Account();
        acct2.setAccountType("emp2-acct-type");
        acct2.setBalance(BigDecimal.valueOf(20001.2));

//        emp2.getAccounts().add(acct2);
//        acct2.setEmployee(emp2);
        emp2.addAccount(acct2);

//        DepartmentDetail departmentDetail = new DepartmentDetail();
        deptDetail = new DepartmentDetail();
        deptDetail.setSize(2222);
        deptDetail.setRevenue(101);
        deptDetail.setDescription("dept detail dummy desc");

        testDept.setDepartmentDetail(deptDetail);
        deptDetail.setDepartment(testDept);

        //Now do the final part, save both dept1 and two employees in one shot
        testDept = departmentDao.save(testDept);
        logger.info("==== within setup, testDept.getId()={}", testDept.getId());
        logger.info("==== within setup, testDept={}", testDept);
    }

    @Test
    public void dummy() {
        logger.info("========= dummy test");
    }

    @After
    public void teardown() {
        departmentDao.delete(testDept);
    }

    @Test
    public void verifySavingDepartmentWithEmployeesTest() {
//        logger.info("==== within verifySavingDepartmentWithEmployeesTest, testDept.getId()={}", testDept.getId());
        Department dept = departmentDao.getDepartmentByName(deptName);
        assertEquals(deptName, deptName);
        assertEquals(2, dept.getEmployees().size());
        logger.info("###@@@+++  retrieved department = {}", dept);
//        for(Employee emp : dept1.getEmployees()) {
//            logger.info("###@@@+++  With Department={}, associated employee={}",
//                    dept.getName(), emp);
//        }
    }

    @Test
    public void getDepartmentEagerByDeptIdTest() {
//        logger.info("==== within getDepartmentEagerByDeptIdTest, testDept.getId()={}", testDept.getId());
        Department department = departmentDao.getDepartmentEagerByDeptId(testDept.getId());
        assertNotNull(department);
        assertEquals(department.getName(), testDept.getName());
        assertTrue(department.getEmployees().size() > 0);
        assertEquals(2, department.getEmployees().size());
    }

    @Test
    public void getDepartmentsTest() {
        List<Department> departmentList = departmentDao.getDepartments();
        assertEquals("There should be only 5 departments",5, departmentList.size());
    }

    @Test
    public void getDepartmentsWithoutJoinFetchHQLTest() {
        List<Department> departmentList = departmentDao.getDepartmentsWithoutJoinFetch();
        assertEquals(5, departmentList.size());
        displayDeptWithEmployeeInfo(departmentList);
    }

    @Test
    public void getDepartmentByNameTest() {
        deptName = "HR";
        Department department = departmentDao.getDepartmentByName(deptName);
        assertEquals(deptName, department.getName());
        logger.info("== retrieved department ={}", department);
        logger.info("==Associated employee size={}", department.getEmployees().size());
//        for(Employee emp : department.getEmployees()) {
//            logger.info("###@@@+++  With Department={}, associated employee={}",
//                    department.getName(), emp);
//        }
    }

    @Test
    public void getDepartmentsUsingHibernateTest() {
//        DepartmentDao departmentDao = new DepartmentDaoImpl();
        List<Department> departments = departmentDao.getDepartments();
        assertEquals(5, departments.size());
//        logger.info("retrieved departments = {}", departments);
        displayDeptWithEmployeeInfo(departments);
    }
    private void displayDeptWithEmployeeInfo(List<Department> deptList) {
        int deptIndex = 1;
        for(Department department : deptList) {
            Set<Employee> employeeSet = department.getEmployees();
            logger.info("@@@###===  Dept No.{} = {}", deptIndex++, department);
            int employeeIndex = 1;
            for(Employee employee : employeeSet) {
                logger.info("\t@@@###===  Employee No.{} = {}", employeeIndex, employee);
                int accountIndex = 1;
                for(Account account : employee.getAccounts()) {
                    logger.info("\t\t@@@###===  Acount No.{} = {}", accountIndex, account);
                }
            }
            logger.info("===========================");
        }
    }

    private void displayDepartmentList(List<Department> deptList) {
        int deptIndex = 1;
        for(Department department : deptList) {
            logger.info("@@@###===   Dept No.{} = {}", deptIndex++, department);
            logger.info("===========================");
        }
    }

    @Test
    public void getDepartmentByIdTest() {
        Department retrievedDepartment = departmentDao.getDepartmentById(testDept.getId());
        assertEquals("id should be same", retrievedDepartment.getId(), testDept.getId());
        assertEquals("description should be same", retrievedDepartment.getDescription(), testDept.getDescription());

    }

    @Test
    public void deleteDepartmentTest() {
        String deptName = "AAA";
        String empName1 = "Frank";
        String empName2 = "Joe";
        Department department = createDepartmentWithEmployees(deptName, empName1, empName2);
        boolean deleteResult = departmentDao.deleteByName(department.getName());
        if(deleteResult)
            logger.info("===== deleteDepartmentTest(), the new create department with name={} is deleted",
                    department.getName());
        else
            logger.info("===== deleteDepartmentTest(), FAILED to delete the new create department with name={} ",
                    department.getName());
    }

    @Test
    public void saveDepartmentHibernateTest() {
        Department department = getDepartmentForTest("IT-test-1", "Virginia", "IT development");
        DepartmentDao departmentDao = new DepartmentDaoImpl();
        Department departmentSaved = departmentDao.save(department);
        assertNotNull("A saved department should have a ID with NULL value", departmentSaved.getId());
        assertEquals("The description value should be the same", department.getDescription(), departmentSaved.getDescription());
        logger.info("Department = {}", departmentSaved);
        logger.info("Saved Department = {}", departmentSaved);
        boolean deleteResult = departmentDao.delete(departmentSaved);
        if(deleteResult)
            logger.info("===== saveDepartmentHibernateTest(), the new create department with name={} is deleted",
                    departmentSaved.getName());
        else
            logger.info("===== saveDepartmentHibernateTest(), FAILED to delete the new create department with name={} ",
                    departmentSaved.getName());

    }

    @Test
    public void saveDepartmentWithDepartmentDetailTest() {
        DepartmentDetail departmentDetail = new DepartmentDetail();
        departmentDetail.setSize(2222);
        departmentDetail.setRevenue(101);
        departmentDetail.setDescription("dept detail dummy desc");

        Department departmentForTest = getDepartmentForTest("dept 111", "location 111", "dept desc 111");
        departmentForTest.setDepartmentDetail(departmentDetail);
        departmentDetail.setDepartment(departmentForTest);

        Department savedDepartment = departmentDao.save(departmentForTest);
        boolean deleteResult = departmentDao.delete(savedDepartment);
        logger.info("deleteResult = {}", deleteResult);
    }

    private Department getDepartmentForTest(String deptName, String location, String deptDesc) {
        Department department = new Department();
        department.setDescription(deptDesc);
        department.setLocation(location);
        department.setName(deptName);
        return department;
    }

    private Department createDepartmentWithEmployees(String deptName, String empName1,
                                                     String empName2) {
        Department dept = new Department();
        dept.setName(deptName);
        dept.setDescription(deptName + " description");
        dept.setLocation("Fairfax, VA");

        Employee emp1 = new Employee();
        emp1.setName(empName1);
        emp1.setAddress("123 Road, VA");
        Employee emp2 = new Employee();
        emp2.setName(empName2);
        emp2.setAddress("456 Road, VA");

        dept.getEmployees().add(emp1);
        emp1.setDepartment(dept);

        dept.getEmployees().add(emp2);
        emp2.setDepartment(dept);

        //Now do the final part, save both dept1 and two employees in one shot
        Department createdDepartment = departmentDao.save(dept);

        return createdDepartment;
    }

}
