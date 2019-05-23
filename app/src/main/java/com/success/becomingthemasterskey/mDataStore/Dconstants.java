package com.success.becomingthemasterskey.mDataStore;

public class Dconstants {
    String chapter;
    String title;
    String body;


    int id;

    public Dconstants() {
    }



    public Dconstants(String chapter, String title, String body)
    {
        this.chapter = chapter;
        this.title = title;
        this.body = body;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
