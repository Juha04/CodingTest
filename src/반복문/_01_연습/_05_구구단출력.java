package 반복문._01_연습;

import java.util.Scanner;

public class _05_구구단출력 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 1; i<10; i++ ){
            System.out.println(N + " x " + i + " = " + (N*i));
        }
        scan.close();
    }
}
