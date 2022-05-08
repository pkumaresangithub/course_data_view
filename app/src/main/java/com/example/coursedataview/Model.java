package com.example.coursedataview;

public class Model {

    String id,catcode, category,author, subject,tutor,institue;

    public Model() {
    }
    public Model(String id, String catcode, String category, String author, String subject, String tutor, String institue) {
        this.id = id;
        this.catcode = catcode;
        this.category = category;
        this.author = author;
        this.subject = subject;
        this.tutor = tutor;
        this.institue = institue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatcode() {
        return catcode;
    }

    public void setCatcode(String catcode) {
        this.catcode = catcode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getInstitue() {
        return institue;
    }

    public void setInstitue(String institue) {
        this.institue = institue;
    }
}
