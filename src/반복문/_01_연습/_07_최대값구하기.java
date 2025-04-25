package 반복문._01_연습;

import java.util.Scanner;

public class _07_최대값구하기 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("정수 5개를 입력하세요: ");

        for(int i =0; i <5; i++) {
            nums[i] = scan.nextInt();
        }

        int max = nums[0];
        for(int i =1; i <5; i++){
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("최대값은: " + max);

    }
}
