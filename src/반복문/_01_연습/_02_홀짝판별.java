package 반복문._01_연습;

import java.util.Scanner;

public class _02_홀짝판별 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        a=scan.nextInt();

        if(a%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        scan.close();
    }
}

