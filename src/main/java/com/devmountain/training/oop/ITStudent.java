package com.devmountain.training.oop;

public class ITStudent extends Student implements DummyInterface, University  {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String greeting(String name) {
        return null;
    }
}
