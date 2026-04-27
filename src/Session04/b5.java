package Session04;

import java.util.Arrays;
import java.util.Scanner;

public class b5 {
    static Scanner sc = new Scanner(System.in);
    static int n, task, t = 0;
    static double[] a;
    static double AverageScore = 0, minScore = 1000000000, maxScore = 0;

    public static void add() {
        while (true) {
            System.out.print("Nhập số lượng nhân viên: ");
            n = Integer.parseInt(sc.nextLine());
            if (n > 0) break;
            System.out.println("Bạn phải nhập vào số nguyên dương, vui lòng thử lại!");
        }
        a = new double[n];  //biet n xong moi cap phat cho a
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập lương nhân viên thứ " + (i + 1) + ": ");
            a[i] = Float.parseFloat(sc.nextLine());
            AverageScore += a[i];
            minScore = Math.min(minScore, a[i]);
            maxScore = Math.max(maxScore, a[i]);
        }
    }

    public static void menu() {
        System.out.println("--- QUẢN LÝ LƯƠNG NHÂN VIÊN ---");
        System.out.println("1. Xem danh sách lương");
        System.out.println("2. Sắp xếp lương");
        System.out.println("3. Tìm kiếm lương cụ thể");
        System.out.println("4. Thống kê lương");
        System.out.println("5. Thoát");
        System.out.print("Lựa chọn của bạn: ");
        task = Integer.parseInt(sc.nextLine());
    }

    public static void Task() {
        switch (task) {
            case 1:
                System.out.println("Danh sách lương nhân viên:");
                for (int i = 0; i < n; i++) {
                    System.out.printf("Nhân viên %d: %.1f\n", i + 1, a[i]);
                }
                System.out.println();
                break;
            case 2:
                System.out.println("Chọn cách sắp xếp:");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                t = Integer.parseInt(sc.nextLine());
                if (t == 1) {
                    Arrays.sort(a);
                    System.out.println("Đã sắp xếp lương tăng dần");
                } else {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i - 1; ++j) {
                            if (a[j + 1] > a[j]) {
                                double temp = a[j];
                                a[j] = a[j + 1];
                                a[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp lương giảm dần");
                }
                System.out.println();
                break;
            case 3:
                int index = -1;
                System.out.print("Nhập lương cần tìm: ");
                float score = Float.parseFloat(sc.nextLine());
                for (int i = 0; i < n; i++) {
                    if (a[i] == score) {
                        index = i + 1;
                        break;
                    }
                }
                String t1 = "Không tìm thấy";
                System.out.println("Linear Search: " + (index < 0 ? t1 : ("Tìm thấy tại vị trí " + index)));
                if (t == 1) System.out.println("Binary Search (mảng tăng dần): " + (index < 0 ? t1 : ("Tìm thấy tại vị trí " + index)));
                System.out.println();
                break;
            case 4:
                System.out.printf("Tổng lương: %.1f\n", AverageScore);
                System.out.printf("Lương trung bình: %f\n", AverageScore/n);
                System.out.printf("Lương cao nhất: %.1f\n", maxScore);
                System.out.printf("Lương thấp nhất: %.1f\n", +minScore);
                int cnt = 0;
                for (int i = 0; i < n; i++) if (a[i] > AverageScore/n) cnt++;
                System.out.println("Số sinh viên có điểm trên trung bình: " + cnt);
                System.out.println();
                break;
            case 5:
                System.out.println("Thoát chương trình !");
                System.exit(0);
                break;
            default:
                System.out.println("Chỉ được chọn từ 1 đến 5, vui lòng chọn lại !");
                System.out.println();
                break;
        }
    }

    public static void main(String[] args) {
        add();
        while (true) {
            menu();
            Task();
        }
    }
}
