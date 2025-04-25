package 반복문._01_연습;

import java.util.Scanner;

public class _04_1부터N까지의합구하기 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 N의 값을 입력하세요> ");
        int N = scan.nextInt();
        int sum=0;

        for(int i=0; i <N; i++){
            sum +=i;
        }

        System.out.println(sum);
    }
}
