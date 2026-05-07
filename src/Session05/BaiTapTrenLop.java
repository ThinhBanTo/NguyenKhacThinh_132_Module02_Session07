package Session05;

import java.util.*;
import java.io.*;

public class BaiTapTrenLop {
    static Scanner sc = new Scanner(System.in);
    static int choices,flag=0;
    static String name,email,number,password;


    public static void menu() {
        System.out.println("******************QUẢN LÝ NGƯỜI DÙNG****************");
        System.out.println("1. Nhập thông tin người dùng");
        System.out.println("2. Chuẩn hóa họ tên ");
        System.out.println("3. Kiểm tra email hợp lệ");
        System.out.println("4. Kiểm tra số điện thoại hợp lệ");
        System.out.println("5. Kiểm tra mật khẩu hợp lệ");
        System.out.println("6. Thoát\n");
        System.out.print("Lựa chọn của bạn: ");
        choices = Integer.parseInt(sc.nextLine());
    }

    public static void options() {
        switch (choices) {
            case 1:
                System.out.println("------------------------------");
                System.out.println("Nhập thông tin người dùng:");
                System.out.print("Họ và tên: ");
                name = sc.nextLine();
                System.out.print("Email: ");
                email = sc.nextLine();
                System.out.print("Số điện thoại: ");
                number = sc.nextLine();
                System.out.print("Mật khẩu: ");
                password = sc.nextLine();
                flag=1;
                System.out.println();
                break;
            case 2:
                System.out.println("---------------------------------------");
                if (flag==0) {
                    System.out.println("Bạn chưa điền thông tin người dùng !\nVui lòng chọn option 1 trước");
                    System.out.println("---------------------------------------");
                    break;
                }
                //vd:   nguyEN   kHac THINH

                //thay nhieu khoang trang thanh 1 khoang trang --> nguyEn Khac Thinh, trim cat khoang trang 2 dau
                String nameTrim=name.trim().replaceAll("\\s+"," ");    //All de thay tat ca thay vi replace (chi thay khoang dau)
                //cat thanh cac xau con de lam tiep
                String[] nameSplit = nameTrim.split(" ");
                //Duyet tung phan tu --> Chuan Hoa (viet thg het + viet hoa tu dau)
                StringBuilder nameResult=new StringBuilder("");
                for (String s: nameSplit) {
                    nameResult.append(Character.toUpperCase(s.charAt(0))).append(((s.substring(1)).toLowerCase())).append(" ");
                }
                System.out.println("Tên sau khi chuẩn hóa: "+nameResult);
                System.out.println("---------------------------------------");
                break;
            case 3:
                System.out.println("---------------------------------------");
                if (flag==0) {
                    System.out.println("Bạn chưa điền thông tin người dùng !\nVui lòng chọn option 1 trước");
                    System.out.println("---------------------------------------");
                    break;
                }
                String emailRegex="\\w+@\\w+\\.com";
                boolean flag1= email.matches(emailRegex);
                System.out.println("Email của người dùng là "+(flag1?"hợp lệ":"không hợp lệ"));
                System.out.println("---------------------------------------");
                break;
            case 4:
                System.out.println("---------------------------------------");
                if (flag==0) {
                    System.out.println("Bạn chưa điền thông tin người dùng !\nVui lòng chọn option 1 trước");
                    System.out.println("---------------------------------------");
                    break;
                }
                String numberRegex="(090|091|092|093|094|096|097|098|099|081|082|083|084|085|086|087|088|089|070|076|077|078|079|052|055|056|057|058|059|032|033|034|035|036|037|038|039|)\\d{7}";
                boolean flag2= number.matches(numberRegex);
                System.out.println("SĐT của người dùng là "+(flag2?"hợp lệ":"không hợp lệ"));
                System.out.println("---------------------------------------");
                break;
            case 5:
                System.out.println("---------------------------------------");
                if (flag==0) {
                    System.out.println("Bạn chưa điền thông tin người dùng !\nVui lòng chọn option 1 trước");
                    System.out.println("---------------------------------------");
                    break;
                }
                //co 3 dieu kien: dunh (?=.*[dk]) de di het 3 dk
                //sau do chon kieu du lieu cho ki tu roi dieu kien cuoi >=8
                String passwordRegex="(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}";
                boolean flag3= password.matches(passwordRegex);
                System.out.println("Mật khẩu của người dùng là "+(flag3?"hợp lệ":"không hợp lệ"));
                System.out.println("---------------------------------------");
                break;
            case 6:
                System.out.println("---------------------------------------");
                System.out.println("Thoát thành công !");
                System.exit(0);
        }
    }

    public static void main() {
        while (true) {
            menu();
            options();
        }
    }
}
