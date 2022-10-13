package com.devmountain.training.pattern.di;

public class ServiceA {

//    private ServiceB serviceB = new ServiceB(30, "dummy");
//    private ServiceB serviceB = new ServiceB(30, "aaa", 10, "nick");
    // String dummy, int sum, String nickName, float num
    private ServiceB serviceB;

    private String email;

    private int age;
    protected int aaa;
    public final String DEPT_NAME = "branch";
    double salary;

    public ServiceA() {

    }

//    public ServiceA(ServiceB serviceB, int dummy) {
////        serviceB = new ServiceB(100, "abc");
//        this.serviceB = serviceB;
//    }
//    private ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void dummyMethod(int age, String str, ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    public void displayGreetingMessage(String name) {
        System.out.println(serviceB.getGreeting(name));
    }

    public boolean isFinalResultPositive(int standardSize, int size) {
        boolean isPositiveFlag = false;
        int finalResult = serviceB.getFinalResult(size);
        if(finalResult >= standardSize)
            isPositiveFlag = true;
        return isPositiveFlag;
    }
}
