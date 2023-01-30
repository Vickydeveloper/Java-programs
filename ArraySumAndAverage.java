//Sum of array elements and average using user-define method

import java.util.Scanner;
public class ArraySumAndAverage {

    private static int sumOfArray(int[] a) {
        int sum=0;
        for(int i=0; i<a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    private static double averageOfArray(int[] a) {
        int sum=0;
        for(int i=0; i<a.length; i++) {
            sum = sum + a[i];
        }
        double average = sum/a.length;
        return average;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of the array is : " + sumOfArray(arr));
        System.out.println("Average of the array is : " + averageOfArray(arr));
    }

}