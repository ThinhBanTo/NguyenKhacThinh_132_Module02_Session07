package Session05;

import java.util.*;
import java.io.*;

public class b2 {
    public static void main(String[] args) {
        String str="Hello";
        StringBuilder sb=new StringBuilder(str);
        StringBuffer sf=new StringBuffer(str);
        long start,end;
        int limit;

        //1.String
        limit=1000;    //de 1000000 vong lap --> String gay treo may
        start = System.currentTimeMillis();
        while(limit--!=0) {
            str+=" Wotld";
        }
        end=System.currentTimeMillis();
        System.out.println("Thời gian thưc hiện với String: "+(end-start)+" ms");

        //2: StringBuilder
        limit=1000000;
        start = System.currentTimeMillis();
        while(limit--!=0) {
            sb.append(" Wotld");
        }
        end=System.currentTimeMillis();
        System.out.println("Thời gian thưc hiện với StringBuilder: "+(end-start)+" ms");

        //3: StringBuffer
        limit=1000000;
        start = System.currentTimeMillis();
        while(limit--!=0) {
            sf.append(" Wotld");
        }
        end=System.currentTimeMillis();
        System.out.println("Thời gian thưc hiện với StringBuffer: "+(end-start)+" ms");

        System.out.println("Nhận xét:\n" +
                "String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.\n" +
                "StringBuilder: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.\n" +
                "StringBuffer: Tương tự như StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");
    }
}
