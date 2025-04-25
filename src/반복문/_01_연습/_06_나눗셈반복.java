package 반복문._01_연습;

import java.util.Scanner;

public class _06_나눗셈반복 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("정수 N의 값을 입력하세요> ");
        int N = scan.nextInt();
        System.out.println("정수 M의 값을 입력하세요> ");
        int M = scan.nextInt();

        while(N>0){
            System.out.println(N);
            N/=M;
        }

    }
}
