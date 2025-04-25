package 반복문._01_연습;

import java.util.Scanner;

public class _08_숫자뒤집기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요> ");
        int a = scan.nextInt();

        while (a>0) {
            int digit = a%10; // 맨 뒤 숫자를 꺼냄 1234%10 = 나머지 4
            System.out.println(digit);
            a=a/10; // 맨 뒤 숫자를 없앰 1230/10 = 123
        }

        System.out.println();

    }
}
