package Session05;

import java.util.*;
import java.io.*;

public class b3 {
    static Scanner sc = new Scanner(System.in);

    public static boolean CheckPassWord(String password) {
        String passwordRegex="(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!^&*])[A-Za-z\\d@#$%!^&*]{8,}";
        return  password.matches(passwordRegex);
    }
    public static void main(String[] args) {
        String password=sc.nextLine();
        System.out.println("Mật khẩu "+(CheckPassWord(password)?"hợp lệ":"không hợp lệ"));
        System.exit(0);
    }
}
