package com.devmountain.training.abstraction;

public class BadPizzaException extends RuntimeException {

    private static final long serialVersionUID = 1310295720395668373L;

    public BadPizzaException() {   super();  }

    public BadPizzaException(String arg0) {
        super(arg0);
    }

    public BadPizzaException(Throwable cause) {
        super(cause);
    }

    public BadPizzaException(String errorMsg, Throwable cause) {
        super(errorMsg, cause);
    }

}
