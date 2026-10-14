package lab2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[4];

        System.out.println("Enter 4 numbers:");
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextDouble();
        }

        System.out.print("Reverse order: ");
        for (int i = 3; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        double sum = 0;
        double max = nums[0];
        double min = nums[0];

        for (int i = 0; i < 4; i++) {
            sum += nums[i];
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }

        double avg = sum / 4.0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        sc.close();
    }
}