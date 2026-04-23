package Session02;

import java.util.Scanner;

public class b2 {
    public static String solve(int n) {
        return switch (n) {
            case 1, 3, 5, 7, 8, 10, 12 -> ("Tháng " + n + " có 31 ngày");
            case 2 -> "Tháng 2 có 28 hoặc 29 ngày";
            case 4, 6, 9, 11 -> ("Tháng " + n + " có 30 ngày");
            default -> "Tháng không hợp lệ";
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tháng bạn muốn xem: ");
        int n=Integer.parseInt(sc.nextLine());
        System.out.println(solve(n));
        System.exit(0);
    }
}
