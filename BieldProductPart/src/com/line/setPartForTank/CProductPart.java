package com.line.setPartForTank;

import com.line.PartsForTank;

public class CProductPart implements IProductPart {
    private String body;
    private String tower;
    private String gun;

    PartsForTank partsForTank = new PartsForTank();

    public void getPartsForTank() {
        System.out.println("Получаем запчасти для танка для передачи на стадии установки.");
        this.body = partsForTank.getBody();
        this.tower = partsForTank.getTower();
        this.gun = partsForTank.getGun();
    }

    public String getBody() {
        System.out.println("Передаём броню");
        return body;
    }

    public String getTower() {
        System.out.println("Передаём башню");
        return tower;
    }

    public String getGun() {
        System.out.println("Передаём пушку");
        return gun;
    }

}
