package Session02;

import java.util.*;

public class b5 {
    public static String VietHoaDau(String text) {
        //string kh the sua, nen tra ve (viet hoa chu dau+lay tu ki tu 1 tro di)
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    public static String DocSo(int n) {
        switch (n) {
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return "";
        }
    }

    public static String SoDacBiet(int n, int tens) {
        switch (n) {
            case 1:
                return (tens > 1) ? "mốt" : "một";
            case 4:
                return (tens >= 1) ? "tư" : "bốn";
            case 5:
                return (tens >= 1) ? "lăm" : "năm";
            default:
                return DocSo(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số lượng testcase:");
        int t = Integer.parseInt(sc.nextLine());

        while (t-- != 0) {
            int n;
            while (true) {
                System.out.print("Số của bạn là: ");
                n = Integer.parseInt(sc.nextLine());
                if (n < 100 || n > 999)
                    System.out.println("Số nhập vào không hợp lệ");
                else break;
            }

            int hundreds = n / 100;
            int tens = (n % 100) / 10;
            int units = n % 10;
            StringBuilder res = new StringBuilder();

            res.append(DocSo(hundreds)).append(" trăm");
            if (tens == 0 && units != 0) res.append(" lẻ");

            if (tens > 0) {
                if (!res.isEmpty()) res.append(" ");
                if (tens == 1) res.append("mười");
                else res.append(DocSo(tens)).append(" mươi");
            }

            if (units != 0) {
                if (!res.isEmpty()) {
                    res.append(" ").append(SoDacBiet(units, tens));
                } else {
                    res.append(DocSo(units));
                }
            }

            System.out.println(VietHoaDau(res.toString()));
        }
    }
}