package com.efb.menuReply;

public class SubMenu {
    public int id;
    public String title;

    public SubMenu(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "SubMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
