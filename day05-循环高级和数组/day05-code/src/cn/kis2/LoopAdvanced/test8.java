package cn.kis2.LoopAdvanced;

import java.util.Random;

public class test8 {
    //随机数

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 20; i++) {
            int number = r.nextInt(10);//0-9
            System.out.println(number);
        }

        System.out.println("while");
        int i = 1;
        while (i<=20) {
            int number = r.nextInt(10);//0-9
            System.out.println(number);
            i++;
        }
        System.out.println("do/while");
        int k=1;
        do {
            int number = r.nextInt(10);//0-9
            System.out.println(number);
            k++;
        } while (k<5);

        System.out.println("--------------------");
        
        //1-10随机数
        for (int j=1;j<=20;j++) {
            int data2 = r.nextInt(10) + 1;
            System.out.println(data2);
        }

        System.out.println("--------------------");

        //65-91
        int data3 = r.nextInt(27) + 65;
        System.out.println(data3);
    }
}
