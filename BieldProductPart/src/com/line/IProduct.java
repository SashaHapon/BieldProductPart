package com.line;

import com.line.setPartForTank.IProductPart;

public interface IProduct {
    void installFirstPart();
    void installSecondPart();
    void installThirdPart();
    public Tank build();
}
