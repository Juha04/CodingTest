package 반복문._02_응용;

import java.util.Scanner;

public class _01_숫자분류기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 몇 개를 입력하시겠습니까> ");
        int N = scan.nextInt();
        int[] nums = new int[N];

        System.out.print("숫자를 입력하세요> ");
        for (int i=0; i<N; i++) {
            nums[i]=scan.nextInt();
        }

        System.out.print("짝수: ");
        for(int i =0; i<N; i++){
            if(nums[i]%2==0){
                System.out.print(nums[i] + " ");
            }
        }

        System.out.print("홀수: ");
        for(int i = 0; i < N; i++){
            if(nums[i]%2 != 0){
                System.out.print(nums[i] + " ");
            }
        }


    }
}
