package org.example.ch09.user;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void addPoint() {
        System.out.println(this.name + "님 포인트가 적립 되었습니다.");
    }
}
