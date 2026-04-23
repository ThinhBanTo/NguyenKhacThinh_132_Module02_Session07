package Session02;

import java.util.*;
import java.io.*;

public class BaiTapTrenLop {
    public static int nto(int a) {
        if (a <= 1) return 0;
        if (a == 2) return 1;
        for (int i = 3; i * i <= a; ++i) {
            if (a % i == 0) return 0;
        }
        return 1;
    }

    public static int perfect(int a) {
        if (a < 2) return 0;
        int sum = 0;
        for (int i = 2; i < a; ++i) {
            if (a % i == 0) sum += i;
        }
        if (sum + 1 == a) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0, sum = 0, cnt = 0, cnt_nto = 0;
        String end = "---------------------------------------";
        do {
            System.out.println("*********************MENU***********************\n1. Nhập vào 1 số nguyên dương n\n2. Tính tổng các số chẵn từ 1 - n\n3. Đếm số lượng số nguyên chia hết cho 3 trong khoảng 1-n\n4. In ra các số nguyên tố trong khoảng 1-n\n5. In ra các số hoàn hảo trong khoảng 1-n\n6. Thoát\n");
            System.out.println("Nhập vào lựa chọn của bạn");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào số nguyên n = ");
                    n = Integer.parseInt(input.nextLine());
                    System.out.println(end);
                    break;
                case 2:
                    sum = 0;
                    for (int i = 2; i <= n; i += 2) sum += i;
                    System.out.println("Tổng các s chẵn từ 1 đến " + n + " là " + sum);
                    System.out.println(end);
                    break;
                case 3:
                    cnt = 0;
                    for (int i = 3; i <= n; i += 3) cnt++;
                    System.out.println("Số lượng số nguyên dương chia hết cho 3 trong khoảng 1 đến " + n + " là " + cnt);
                    System.out.println(end);
                    break;
                case 4:
                    cnt_nto = 0;
                    for (int i = 2; i <= n; ++i) {
                        if (nto(i) == 1) cnt_nto++;
                    }
                    System.out.println("Số lượng số nguyên tố trong khoảng 1 đến " + n + " là " + cnt_nto);
                    System.out.println(end);
                    break;
                case 5:
                    System.out.println("Các số hoàn hảo từ 1 đến " + n + " là:");
                    for (int i = 2; i <= n; ++i) {
                        if (perfect(i) == 1) System.out.print("\t" + i);
                    }
                    System.out.println();
                    System.out.println(end);
                    break;
                case 6:
                    System.out.println("Thoát thành công !");
                    System.exit(0);
                default:
                    System.err.println("Lỗi rồi!\nBạn chỉ được phép chọn từ 1 đến 6,vui lòng thử lại!");
                    System.out.println(end);
                    break;
            }
        } while (true);
    }
}