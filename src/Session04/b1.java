package Session04;

import java.util.*;
import java.io.*;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào các phần tử của mảng: ");


        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            a[i] = Integer.parseInt(sc.nextLine());
        }

        //bubble sort
        for (int i = 0; i < n-1; ++i) {
            for (int j = 0; j < n-i-1; ++j) {
                if (a[j+1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        for (int x: a) System.out.print(x+" ");
    }
}
