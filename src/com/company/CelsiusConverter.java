package com.company;

public class CelsiusConverter extends BaseConverter{
    CelsiusConverter(double number){
        super(number);
    }
    @Override
    double getConvert() {
        return number;
    }
}
