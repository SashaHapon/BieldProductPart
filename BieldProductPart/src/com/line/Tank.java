package com.line;

public class Tank {
    private String body;
    private String tower;
    private String gun;

    public Tank(){
        super();
    };

    public Tank(String body, String tower, String gun){
        this();
        this.body = body;
        this.tower = tower;
        this.gun = gun;

    }

    public void setBody(String body){
        this.body = body;
    }

    public void setTower(String tower){
        this.tower = tower;
    }

    public void setGun(String gun){
        this.gun = gun;
    }


    public String getBody() {
        return body;
    }

    public String getTower() {
        return tower;
    }

    public String getGun() {
        return gun;
    }
}
