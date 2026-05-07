package Session06;

import java.util.*;

public class b3 {
    static Scanner sc = new Scanner(System.in);
    static int choice, cnt = 0;
    static ArrayList<String> listBien = new ArrayList<>();

    public static void menu() {
        System.out.print("****************** QUẢN LÝ BIỂN SỐ XE ******************\n" +
                "1. Thêm các biển số xe\n" +
                "2. Hiển thị danh sách biển số xe\n" +
                "3. Tìm kiếm biển số xe\n" +
                "4. Tìm biển số xe theo mã tỉnh\n" +
                "5. Sắp xếp biển số xe tăng dần\n" +
                "6. Thoát\n" +
                "Lựa chọn của bạn: ");
        choice = Integer.parseInt(sc.nextLine());
    }

    public static void option() {
        if (choice>1 && listBien.isEmpty()) {
            System.out.println("-----------------------------------------------");
            System.out.println("Bạn chưa nhập biển số xe nào, vui lòng chọn option 1 !");
            System.out.println("-----------------------------------------------");
            return;
        }
        switch (choice) {
            case 1:
                System.out.println("-----------------------------------------------");
                System.out.println("Bắt đầu thêm các biển số xe mới (Nhập -1 để dừng):");
                while(true) {
                    System.out.print("Biển số xe thứ "+(cnt+1)+": ");
                    String bien=sc.nextLine();
                    if (bien.equals("-1")) {
                        System.out.println("-----------------------------------------------");
                        return;
                    }
                    cnt++;
                    listBien.add(bien);
                }
            case 2:
                System.out.println("-----------------------------------------------");
                System.out.println("Danh sách các biển số xe:");
                for (String s: listBien) {
                    System.out.println("- "+s);
                }
                System.out.println("-----------------------------------------------");
                break;
            case 3:
                System.out.println("---------------------------------------------");
                System.out.print("Nhập biển số xe cần tìm chính xác: ");
                String find = sc.nextLine();
                if (listBien.contains(find)) {      //xem list chua bien ko
                    System.out.println("Tìm thấy biển số: " + find + " trong danh sách");
                } else {
                    System.out.println("Không tìm thấy biển số này.");
                }
                System.out.println("---------------------------------------------");
                break;
            case 4:
                System.out.println("---------------------------------------------");
                System.out.print("Nhập mã tỉnh cần tìm kiếm (Ví dụ 29,30,...):");
                String findCity = sc.nextLine();
                System.out.println("Các biển số xe thuộc mã tỉnh này là:");
                for (String s: listBien) {
                    if (s.startsWith(findCity)) {
                        System.out.println("- "+s);
                    }
                }
                System.out.println("---------------------------------------------");
                break;
            case 5:
                System.out.println("---------------------------------------------");
                listBien.sort(Comparator.naturalOrder());
                System.out.println("Đã sắp xếp các biển số theo thứ tự tăng dần, vui lòng chọn option 2 để hiển thị lại danh sách !");
                System.out.println("---------------------------------------------");
                break;
            case 6:
                System.out.println("---------------------------------------------");
                System.out.println("Thoát thành công !");
                System.out.println("---------------------------------------------");
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            option();
        }
    }
}
