package Session06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class b2 {
    static Scanner sc = new Scanner(System.in);
    static int choice, cnt = 0;
    static String fullName, email, number, password,
            emailRegex = "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}",
            numberRegex = "(03|05|07|08|09)\\d{8}",
            passwordRegex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!^&*])[A-Za-z\\d@#$%!^&*]{8,}";
    static ArrayList<Float> listScore = new ArrayList<>();
    static Float minScore = 10F, maxScore = 0F, totalScore = 0F;

    public static void menu() {
        System.out.print("****************** QUẢN LÝ ĐIỂM SV ******************\n" +
                "1. Nhập thông tin người dùng\n" +
                "2. Chuẩn hóa họ tên\n" +
                "3. Kiểm tra email hợp lệ\n" +
                "4. Kiểm tra số điện thoại hợp lệ\n" +
                "5. Kiểm tra mật khẩu hợp lệ\n" +
                "6. Thoát\n" +
                "Lựa chọn của bạn: ");
        choice = Integer.parseInt(sc.nextLine());
    }

    public static void option() {
        switch (choice) {
            case 1:
                System.out.println("-----------------------------------------------");
                System.out.println("Nhập thông tin cho người dùng:");
                System.out.print("Họ và tên: ");
                fullName = sc.nextLine();
                System.out.print("Email: ");
                email = sc.nextLine();
                System.out.print("Số điện thoại: ");
                number = sc.nextLine();
                System.out.print("Mật khẩu: ");
                password = sc.nextLine();
                System.out.println("-----------------------------------------------");
                break;
            case 2:
                System.out.println("-----------------------------------------------");
                if (fullName == null || fullName.equals("")) {
                    System.out.println("Chưa nhập tên người dùng !");
                    return;
                }
                System.out.println("Tên người dùng đã thêm: "+fullName);
                //chuan hoa:
                String trimName=fullName.trim().replaceAll("\\s+"," ");
                String[] listName=trimName.split(" ");
                StringBuilder sb=new StringBuilder();
                for (String s: listName) {
                    sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase()).append(" ");
                }
                fullName=sb.toString();
                System.out.println("Đã chuẩn hóa lại tên chính xác: "+fullName);
                System.out.println("-----------------------------------------------");
                break;
            case 3:
                System.out.println("---------------------------------------------");
                if (email == null || email.equals("")) {
                    System.out.println("Chưa nhập email người dùng !");
                    return;
                }
                System.out.println("Email của người dùng là " + (email.matches(emailRegex) ? "hợp lệ:" : "không hợp lệ"));
                System.out.println("---------------------------------------------");
                break;
            case 4:
                System.out.println("---------------------------------------------");
                if (number == null || number.equals("")) {
                    System.out.println("Chưa nhập số điện thoại người dùng !");
                    return;
                }
                System.out.println("Sđt của người dùng là " + (number.matches(numberRegex) ? "hợp lệ:" : "không hợp lệ"));
                System.out.println("---------------------------------------------");
                break;
            case 5:
                System.out.println("---------------------------------------------");
                if (password == null || password.equals("")) {
                    System.out.println("Chưa nhập số mật khẩu người dùng !");
                    return;
                }
                System.out.println("Mật khẩu của người dùng là " + (password.matches(passwordRegex) ? "hợp lệ:" : "không hợp lệ"));
                System.out.println("---------------------------------------------");
                break;
            case 6:
                System.out.println("---------------------------------------------");
                System.out.println("Thoát thành công !");
                System.exit(0);
                System.out.println("---------------------------------------------");
                break;
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            option();
        }
    }
}
