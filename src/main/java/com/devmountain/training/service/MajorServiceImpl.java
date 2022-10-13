package com.devmountain.training.service;

import com.devmountain.training.dao.MajorDao;

public class MajorServiceImpl {
    private MajorDao majorDao;

    public MajorServiceImpl(MajorDao majorDao) {
        this.majorDao = majorDao;
    }

}
