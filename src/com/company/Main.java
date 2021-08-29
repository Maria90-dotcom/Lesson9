package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        BaseConverter temp1 = new CelsiusConverter(45);
        System.out.println("Температура в градусах Цельсия:"+ temp1.getConvert());
        BaseConverter temp2 = new KelvinCorverter(45);
        System.out.println("Температура в градусах Кельвина:"+temp2.getConvert());
        BaseConverter temp3 = new FaringateConverter(45);
        System.out.println("Температура в градусах Фарингейта:"+temp3.getConvert());

    }
}
