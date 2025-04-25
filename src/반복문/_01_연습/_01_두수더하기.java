package 반복문._01_연습;

import java.util.Scanner;

    public class _01_두수더하기 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a, b;
            a=scan.nextInt();
            b=scan.nextInt();

            a+=b;

            System.out.println("두 수의 합: " + a);

            scan.close();
        }
    }

