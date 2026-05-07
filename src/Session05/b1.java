package Session05;

import java.util.*;
import java.io.*;

public class b1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String emailRegex= "[a-zA-Z\\d._]+@[a-zA-Z\\d.]+\\.\\w{2,6}";
        int t;
        System.out.print("Nhập vào số testcase: ");
        t=Integer.parseInt(sc.nextLine());
        for (int i=1;i<=t;++i) {
            System.out.println("Testcase "+i+" :");
            String email;
            System.out.print("Nhập vào email: ");
            email=sc.nextLine();
            System.out.println("Email "+(email.matches(emailRegex)?"hợp lệ":"không hợp lệ"));
        }
    }
}
