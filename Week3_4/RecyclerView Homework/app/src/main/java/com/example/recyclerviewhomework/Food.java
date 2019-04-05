package com.example.recyclerviewhomework;

public class Food {
    private String title, desc;
    public Food() {
    }

    public Food(String title, String desc) {
        this.title = title;
        this.desc = desc;
     }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
