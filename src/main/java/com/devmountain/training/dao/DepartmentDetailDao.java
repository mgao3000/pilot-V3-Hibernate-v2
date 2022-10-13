package com.devmountain.training.dao;

import com.devmountain.training.entity.DepartmentDetail;

import java.util.List;

public interface DepartmentDetailDao {
    List<DepartmentDetail> getDepartmentDetails();
    DepartmentDetail getDepartmentDetailById(Long id);
    DepartmentDetail save(DepartmentDetail departmentDetail);
    boolean delete(DepartmentDetail departmentDetail);
}
