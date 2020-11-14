package Javabook;

import java.util.Scanner;

public class exswitch {

    public static void main(String[] args) {
        int number;
        System.out.println("输入一个正整数");
        Scanner reader = new Scanner(System.in);
        number = reader.nextInt();
        switch (number){

            case 9:
            case 8:
                System.out.println(number);
                break;

            case 7:
                break;
            default: System.out.println("0000");
        }
    }
}
