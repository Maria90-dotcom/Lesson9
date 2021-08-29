package com.company;

public class KelvinCorverter extends BaseConverter{
    KelvinCorverter(double number){
        super(number);
    }

    @Override
    double getConvert() {
        return number+273.15;
    }
}
