package com.nag.reststart;

import java.io.Serializable;

public class HelloBean {

    private String message;

    public HelloBean(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
