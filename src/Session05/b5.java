package Session05;

import java.util.*;

public class b5 {
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static String str;

    public static void menu() {
        System.out.print("************************** MENU **************************\n" +
                "        1. Nhập chuỗi\n" +
                "2. Đếm số ký tự thường, hoa, số, đặc biệt\n" +
                "3. Đảo ngược chuỗi\n" +
                "4. Kiểm tra Palindrome\n" +
                "5. Chuẩn hóa chuỗi\n" +
                "6. Thoát\n" +
                "Chọn: ");
        choice = Integer.parseInt(sc.nextLine());
    }

    public static void option() {
        //kiem tra nhap option 1 trc
        if ((choice>1) && (str==null || str.isEmpty())) {
            System.out.println("Bạn chưa nhập chuỗi!\nVui lòng chọn option 1");
            return;
        }
        switch (choice) {
            case 1:
                System.out.print("Nhập chuỗi: ");
                str = sc.nextLine();
                System.out.println();
                break;
            case 2:
                int low = 0, up = 0, d = 0, special = 0;
                for (char ch : str.toCharArray()) {
                    if (ch >= 48 && ch <= 57) d++;
                    else if (ch >= 65 && ch <= 90) up++;
                    else if (ch >= 97 && ch <= 122) low++;
                    else if (!Character.isWhitespace(ch)) special++;  //ky tu dac biet khac space
                }
                System.out.println("Số ký tự thường: " + low);
                System.out.println("Số ký tự hoa: " + up);
                System.out.println("Số chữ số: " + d);
                System.out.println("Số ký tự đặc biệt: " + special);
                System.out.println();
                break;
            case 3:
                String sb=new StringBuilder(str).reverse().toString();
                System.out.println("Chuỗi đảo ngược: "+sb);
                System.out.println();
                break;
            case 4:
                String sb1=new StringBuilder(str).reverse().toString();
                int flag=sb1.compareToIgnoreCase(str);   //tra ve 0 neu 2 chuoi = nhau
                System.out.println("Chuỗi "+(flag==0?"là Palindrome.":"không phải Palindrome."));
                System.out.println();
                break;
            case 5:
                String stringTrim=str.trim().replaceAll("\\s+", " ");
                String [] ListString=stringTrim.split(" ");
                StringBuilder ResultString=new StringBuilder("");
                ResultString.append(Character.toUpperCase(ListString[0].charAt(0))).append(ListString[0].substring(1).toLowerCase());
                for (int i=1;i<ListString.length;i++) {
                    ResultString.append(" ").append(ListString[i].toLowerCase());
                }
                System.out.println("Chuỗi sau khi chuẩn hóa: "+ResultString);
                System.out.println();
                break;
            case 6:
                System.out.println("Tạm biệt!");
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
