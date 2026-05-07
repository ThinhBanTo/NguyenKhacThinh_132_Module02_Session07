package Session05;

import java.util.*;
import java.io.*;

public class b4 {
    static Scanner sc = new Scanner(System.in);
    public static void generateRandomString(int n) {
        //tao string luu tap ky tu dc su dung
        String charPool="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";
        //Goi ham Random de sinh 1 phuong thuc sinh ky tu ngau nhien
        Random rand = new Random();
        //Tao xau dong de them ra ket qua cuoi cung
        StringBuffer sb = new StringBuffer();
        //Tao vong lap n lan: sinh ngau nhien 1 index, lay stringPool[index] ay
        for (int i = 0; i < n; i++) {
            int index=rand.nextInt(charPool.length());   //index chi nam trong khoang (So luong cac ky tu cua charPool)
            sb.append(charPool.charAt(index));
        }
        //in ra
        System.out.println("Xâu được sinh ra: "+sb.toString());
    }


    public static void main(String[] args) {
        int t;
        System.out.print("Nhập vào số testcase: ");
        t = Integer.parseInt(sc.nextLine());
        System.out.println("Bắt đầu sinh các testcase:");
        System.out.println("--------------------------");
        while (t-- != 0) {
            int n;
            System.out.print("Số lượng ký tự của xâu: ");
            n = Integer.parseInt(sc.nextLine());
            generateRandomString(n);
            System.out.println("--------------------------");
        }
        System.exit(0);
    }
}
