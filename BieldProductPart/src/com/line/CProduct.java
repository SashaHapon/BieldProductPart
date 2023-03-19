package com.line;

import com.line.setPartForTank.CProductPart;
import com.line.setPartForTank.IProductPart;

public class CProduct implements IProduct{
    IProductPart partPartForTank = new CProductPart();
    private String body;
    private String tower;
    private String gun;
    @Override
    public void installFirstPart() {
        System.out.println("Устанавливаем броню");
        this.body =  partPartForTank.getBody();
    }

    @Override
    public void installSecondPart() {
        System.out.println("Устанавливаем башню");
        this.tower =  partPartForTank.getTower();
    }

    @Override
    public void installThirdPart() {
        System.out.println("Устанавливаем пушку");
        this.gun = partPartForTank.getGun();
    }

    @Override
    public Tank build() {
        System.out.println("Собираем танк из запасных частей");
        Tank tank = new Tank(body,tower,gun);
        return tank;
    }


}
