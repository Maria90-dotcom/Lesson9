package com.company;

public abstract class BaseConverter {
    double number;
    BaseConverter(double number){
        this.number = number;
    }

    double getConvert(){
        return number;
    }

}
