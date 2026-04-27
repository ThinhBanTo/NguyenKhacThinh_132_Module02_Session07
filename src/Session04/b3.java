package Session04;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class b3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap mang a[n]
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào các phần tử của mảng: ");


        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        //sort a[n] va in ra (giam dan--> dung tang dan + inverse)
        Arrays.sort(a);
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        for (int i=n-1;i>=0;--i) System.out.print(a[i]+" ");
        System.out.println();

        //search
        System.out.print("Nhập số cần tìm: ");
        int x=Integer.parseInt(sc.nextLine());
        //linear search
        for (int i=0;i<n;++i) {
            if (a[i]==x) {
                System.out.println("Tìm kiếm tuyến tính: Số "+x+" có tại vị trí "+(n-i-1));
                break;
            }
        }
        //binary search
        int index= Arrays.binarySearch(a,x)+1;
        System.out.println("Tìm kiếm nhị phân: Số "+x+" có tại vị trí "+(n-index));

        //thoat
        System.exit(0);
    }
}
