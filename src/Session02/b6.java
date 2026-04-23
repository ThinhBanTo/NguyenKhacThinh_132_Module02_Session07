package Session02;

import java.util.*;

public class b6 {
    public static int check(long a) {
        StringBuilder s = new StringBuilder(Long.toString(a));
        long sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            sum += (long) Math.pow(s.charAt(i) - '0', s.length());
        }
        if (sum == a) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Nhập số nguyên dương n = ");
            n = Integer.parseInt(sc.nextLine());
            if (n <= 0) System.out.println("Số nhập vào không hợp lệ");
            else break;
        }
        System.out.println("Các số Armstrong trong khoảng từ 0 đến " + n + " là: ");
        for (int i = 0; i <= n; i++) {
            if (check(i) == 1) System.out.print(i + " ");
        }
    }
}
