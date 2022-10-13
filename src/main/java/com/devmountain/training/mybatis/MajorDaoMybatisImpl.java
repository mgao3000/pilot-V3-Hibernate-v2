package com.devmountain.training.mybatis;

import com.devmountain.training.dao.MajorDao;
import com.devmountain.training.entity.Major;

import java.util.List;

public class MajorDaoMybatisImpl implements MajorDao {
    @Override
    public Major save(Major major) {
        return null;
    }

    @Override
    public Major update(Major major) {
        return null;
    }

    @Override
    public boolean deleteByName(String majorName) {
        return false;
    }

    @Override
    public boolean deleteById(Long majorId) {
        return false;
    }

    @Override
    public boolean delete(Major major) {
        return false;
    }

    @Override
    public List<Major> getMajors() {
        return null;
    }

    @Override
    public Major getMajorById(Long id) {
        return null;
    }

    @Override
    public Major getMajorByName(String majorName) {
        return null;
    }

    @Override
    public List<Major> getMajorsWithChildren() {
        return null;
    }

    @Override
    public Major getMajorAndStudentsAndProjectsByMajorId(Long majorId) {
        return null;
    }

    @Override
    public Major getMajorAndStudentsAndProjectsByMajorName(String majorName) {
        return null;
    }
}
