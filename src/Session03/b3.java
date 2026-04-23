package Session03;
import java.util.*;

public class b3 {
    static int choice,cnt=0;
    static float sum=0,sum_bonus=0,maxSalary=0, minSalary =500000000;
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("**************** MENU NHẬP LƯƠNG ****************");
        System.out.println("1.    Nhập lương nhân viên");
        System.out.println("2.    Hiển thị thống kê");
        System.out.println("3.    Tính tổng số tiền thưởng cho nhân viên");
        System.out.println("4.    Thoát");
        System.out.print("Lựa chọn của bạn: ");
        choice = Integer.parseInt(input.nextLine());
        System.out.println();
    }

    public static void task(int n) {
        switch (n) {
            case 1:
                System.out.println("----- Nhập lương nhân viên (nhập -1 để kết thúc) -----");

                while (true) {
                    System.out.print("Nhập lương: ");
                    float salary = Float.parseFloat(input.nextLine());
                    if (salary == -1) break;
                    else if ((salary < 0 || salary > 500000000)) {
                        System.out.println("Lương không hợp lệ. Nhập lại!");
                        continue;
                    }

                    cnt++;
                    sum += salary;
                    minSalary = Math.min(minSalary, salary);
                    maxSalary = Math.max(maxSalary, salary);

                    if (salary>100000000) sum_bonus+=salary*25/100;
                    else if (salary>50000000) sum_bonus+=salary*20/100;
                    else if (salary>15000000)  sum_bonus+=salary*15/100;
                    else if (salary>5000000) sum_bonus+=salary*10/100;
                    else sum_bonus+=salary*5/100;

                    String rank;
                    if (salary > 50000000) rank = "Cao";
                    else if (salary > 15000000) rank = "Khá";
                    else if (salary >= 5000000) rank = "Trung bình";
                    else rank = "Thấp";
                    System.out.println("-> Phân loại: "+rank);
                }
                System.out.println();

                break;

            case 2:
                System.out.println("-------- Thống kê -------");
                if (cnt == 0) System.out.println("Chưa có dữ liệu");
                else {
                    System.out.println("Số nhân viên: " + cnt);
                    System.out.printf("Tổng lương: %.0f VND\n",sum);
                    System.out.printf("Lương trung bình: %.0f VND\n", sum / cnt);
                    System.out.printf("Lương cao nhất: %.0f VND\n",maxSalary);
                    System.out.printf("Lương thấp nhất: %.0f VND\n", minSalary);

                }
                System.out.println();

                break;

            case 3:
                System.out.println("------- Tính tổng số tiền thưởng nhân viên -------");
                System.out.printf("Tổng số tiền thưởng nhân viên: %.0f VND\n",sum_bonus);
                System.out.println();

                break;

            case 4:
                System.out.println("Kết thúc chương trình.");
                System.exit(0);

            default:
                System.out.println("Bạn chỉ được phép chọn từ 1 đến 4");
                break;
        }
    }
    public static void main (String[]args){
        while (true) {
            menu();
            task(choice);
        }
    }
}
