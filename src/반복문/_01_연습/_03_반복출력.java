package 반복문._01_연습;

import java.util.Scanner;

public class _03_반복출력 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("반복 할 횟수를 입력하세요> ");
        int a=scan.nextInt();

        for(int i = 0; i < a; i++){
            System.out.println("Hello");
        }
        scan.close();
    }
}
