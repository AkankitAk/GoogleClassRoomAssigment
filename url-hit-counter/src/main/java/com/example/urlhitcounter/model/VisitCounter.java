package com.example.urlhitcounter.model;

public class VisitCounter {

    private String username;
    private int count;

    public VisitCounter(String username, int count) {
        this.username=username;
        this.count=count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "username='" + username + '\'' +
                ", count=" + count +
                '}';
    }
}