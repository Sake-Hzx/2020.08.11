package com.guigu.vo;

public class Menu {
    Integer id;
    String text;
    String url;
    String image;
    String state;
    Integer parentid;

    public Menu() {
    }

    public Menu(Integer id, String text, String url, String image, String state, Integer parentid) {
        this.id = id;
        this.text = text;
        this.url = url;
        this.image = image;
        this.state = state;
        this.parentid = parentid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", image='" + image + '\'' +
                ", state='" + state + '\'' +
                ", parentid=" + parentid +
                '}';
    }
}
