package Session04;

import java.util.*;
import java.io.*;

public class b2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hàng của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số hàng của mảng: ");
        int m = Integer.parseInt(sc.nextLine());
        int[][] a = new int[n][m];
        int sum_odd=0,sum_even=0;

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.printf("Phần tử [%d][%d]: ",i,j);
                a[i][j]=Integer.parseInt(sc.nextLine());
                if (a[i][j]%2==0) sum_odd+=a[i][j];
                else sum_even+=a[i][j];
            }
        }
        System.out.println("Tổng các số chẵn: "+sum_odd);
        System.out.println("Tổng các số lẻ: "+sum_even);
        System.exit(0);
    }
}
