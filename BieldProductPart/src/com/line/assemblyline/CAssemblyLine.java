package com.line.assemblyline;

import com.line.CProduct;
import com.line.IProduct;
import com.line.Tank;

public class CAssemblyLine implements IAssemblyLine {

        IProduct product = new CProduct();

    @Override
    public Tank assembleProduct() {

        product.installFirstPart();
        product.installSecondPart();
        product.installSecondPart();
        Tank panther = product.build();
        System.out.println("Получаем новый танк после конвеера");
        return panther;
    }


}
