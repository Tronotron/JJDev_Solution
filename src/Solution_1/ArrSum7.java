package Solutions_1;

import java.util.Scanner;
import java.lang.ArrayStoreException;

public class ArrSum7 {

    public static void main(String[] args) {
        //int[] arr = {4, 6, 6, 7, 8, 3, 5, 2, 1, 6};
        int[] arr;
        int arrNumber;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число элементов в массиве: ");
        arrNumber = in.nextInt();
        System.out.println("Число элементов в массиве: " + arrNumber);
        arr = new int[arrNumber];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите значение элемента массива[" + i + "] = ");
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i<arr.length - 1; i++) {
            for (int m = i + 1; m < arr.length; m++){
                int sum = arr[i] + arr[m];
                if (sum == 7) {
                    System.out.println("Сумма элементов массива " + arr[i] +  " + " + arr[m]);
                }
            }
        }
    }
}
