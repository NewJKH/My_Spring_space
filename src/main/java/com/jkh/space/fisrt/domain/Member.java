package com.jkh.space.fisrt.domain;

public class Member {
    private long id;
    private final String name;

    public Member(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

}
