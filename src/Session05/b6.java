package Session05;

import java.util.*;
import java.io.*;

public class b6 {
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static ArrayList<String> ListName= new ArrayList<>();   //mảng String động

    public static void menu() {
        System.out.print("========== QUẢN LÝ TÊN SINH VIÊN ==========\n" +
                "   1. Thêm tên sinh viên\n" +
                "2. Hiển thị danh sách\n" +
                "3. Tìm tên sinh viên chứa từ khóa\n" +
                "4. Đếm số sinh viên có tên bắt đầu bằng chữ cái nhập vào\n" +
                "5. Sắp xếp danh sách tên theo thứ tự A-Z\n" +
                "6. Thoát\n" +
                "===========================================\n" +
                "Chọn: ");
        choice = Integer.parseInt(sc.nextLine());
    }

    public static void option() {
        switch (choice) {
            case 1:
                System.out.print("Nhập tên sinh viên: ");
                String name=sc.nextLine();
                ListName.add(name);
                System.out.println("Đã thêm: "+name);
                System.out.println();
                break;
            case 2:
                System.out.println("Danh sách sinh viên:");
                for (int i=0;i<ListName.size();i++) {
                    System.out.println(i+1+". "+ListName.get(i));    //lay gia tri = get(index)
                }
                System.out.println();
                break;
            case 3:
                System.out.print("Nhập từ khóa: ");
                String word=sc.nextLine();
                System.out.println("Kết quả tìm kiếm:");
                for (String s: ListName) {
                    if (s.contains(word)) System.out.println("- "+s);
                }
                System.out.println();
                break;
            case 4:
                System.out.print("Nhập chữ cái: ");
                String BeginName=sc.nextLine();
                int cnt=0;
                for (String s: ListName) {
                    if (Character.toLowerCase(s.charAt(0))==Character.toLowerCase(BeginName.charAt(0))) cnt++;
                }
                System.out.println("Số sinh viên có tên bắt đầu '"+BeginName+"': "+cnt);
                System.out.println();
                break;
            case 5:
                System.out.println("Danh sách đã được sắp xê A-Z.");
                ListName.sort(Comparator.naturalOrder());   //sort đúng thứ tự tên (từ điển)
                System.out.println();
                break;
            case 6:
                System.out.println("Tạm biệt!");
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        while(true){
            menu();
            option();
        }
    }
}

