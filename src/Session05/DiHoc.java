package Session05;
import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class DiHoc {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        //cat 1 chuoi thanh 1 mang cac chuoi
//        String str1="Hello My  Friend";
//        String[] str2= str1.split(" ");
//        for (String s: str2) System.out.println(s+";");
//        System.exit(0);
//
        //regex:
        /* Ví dụ
        * Kiểm tra số điện thoại có phải sđt VN ko
        * -Gồm các số
        * - Gồm 10 số
        * - Bắt đầu là các số 090,091,092,094,096,096,098,099,035
        *
         */
        String phoneInput=sc.nextLine();
        String phoneRegex="(090|091|092|094|096|098|099|035)\\d{7}";
//        boolean flag= Pattern.matches(phoneRegex,phoneInput);
        boolean flag= phoneInput.matches(phoneRegex);
        System.out.println("Số điện thoại là "+((flag==true)?"hợp lệ":"không hợp lệ"));
    }
}
