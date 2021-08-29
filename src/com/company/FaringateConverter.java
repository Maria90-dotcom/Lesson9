package com.company;

public class FaringateConverter extends BaseConverter {
    FaringateConverter(double number) {
        super(number);
    }

    @Override
    double getConvert() {
        return 1.8 * number + 32;
    }


}
