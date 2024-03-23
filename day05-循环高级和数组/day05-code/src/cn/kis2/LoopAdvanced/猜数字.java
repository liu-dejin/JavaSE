package cn.kis2.LoopAdvanced;

import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
        Random r = new Random();
        int lucknumber = r.nextInt(100) + 1;
        System.out.println(lucknumber);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入猜测的数字");
            int guessNumber = sc.nextInt();
            if (guessNumber < lucknumber) {
                System.out.println("您猜测的数字过小");
            } else if (guessNumber > lucknumber) {
                System.out.println("您猜测的数字过大");
            } else {
                System.out.println("恭喜您猜对了");
                break;
            }
        }
    }
}
