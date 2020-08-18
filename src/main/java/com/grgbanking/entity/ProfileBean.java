package com.grgbanking.entity;

public class ProfileBean {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    };

    public ProfileBean(String content) {
        this.content = content;
    }
}
