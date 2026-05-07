package Session05;

import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lythuyet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1: khoi tao String
        String a = "hello"; //luu vao heap (1 mang stack da tao san)
        String b = new String("Hello"); //tao khoang trong ben ngoai de luu string moi (ton bo nho)
        // 2: cac ham cua String
        //2.1: compareTo (so sanh 2 chuoi)
        String str1 = "Hello", str2 = "Hi";
        int cmp = str1.compareTo(str2);
        //2.2: contain: xem chuoi A co chua chuoi B ko
        boolean isExist = str1.contains(str2);
        //2.3: substring: cat chuoi
        str2.substring(4, 5);
        //cat chuoi thanh mang: Muon cat thanh 1 mang cac sau con
        String[] arrStr = str2.split(" "); //cat boi dau cach
        //3: StringBuilder va StringBuffer
        //cu phap: StringBuilder sb=new StringBuilder(rỗng || int capacity || String str)
        //3.1: Khoi tao
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(5);
        StringBuilder sb3 = new StringBuilder("Hello");
        //3.2: Phuong thuc lam viec
        sb1.insert(2, "taolaThinh"); //chen sau tai truoc index 2
        sb1.append("taolaThinh");  //chen vao cuoi
        sb1.delete(1, 3); //vi tri start-end
        //bam dau . de xem cac ham khac

        //3.3: regular expression: Regex: so khop 1 bieu thuc truyen vao <-> chinh quy
        //import java.util.regex
        //c1:
        Pattern pattern = Pattern.compile(".s");
        Matcher matcher = pattern.matcher("as");
        boolean result = matcher.matches();
        //c2: nhanh hon
        boolean result1 = Pattern.compile(".s").matcher("as").matches();
        boolean result2 = Pattern.matches(".s", "as");
        //vd: [0-9] : 1 ky tu so ; {3,7} - so lan xuat hien (3->7)
        String regex = "[0,9]{3,7}";
        String[] input = {"0935", "c734", "23"};
        Pattern pattern1 = Pattern.compile(regex);
        for (String str : input) {
            boolean isMatch = Pattern.matches(regex, str);
            //vd2:
            String email = "thinhconngua@gmail.com";
            isEmailValid(email);
        }
    }

    //vd2:  quy tac lap mail: username@OrganizationName. area symbol
    public static boolean isEmailValid(String email) {
        final String regex1 = "^\\w+@\\w+.\\w+$";
        return Pattern.matches(regex1, email);
    }
}
