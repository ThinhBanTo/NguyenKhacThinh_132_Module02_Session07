package Session04;

import java.util.*;

public class b4 {
    static Scanner sc = new Scanner(System.in);
    static int n, task, t=0;
    static float[] a;
    static float AverageScore = 0, minScore = 10, maxScore = 0;

    public static void add() {
        while (true) {
            System.out.print("Nhập số lượng sinh viên: ");
            n = Integer.parseInt(sc.nextLine());
            if (n > 0) break;
            System.out.println("Bạn phải nhập n nguyên dương, vui lòng thử lại!");
        }
        a = new float[n];  //biet n xong moi cap phat cho a
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
            a[i] = Float.parseFloat(sc.nextLine());
            AverageScore += a[i];
            minScore = Math.min(minScore, a[i]);
            maxScore = Math.max(maxScore, a[i]);
        }
    }

    public static void menu() {
        System.out.println("--- QUẢN LÝ ĐIỂM SINH VIÊN ---");
        System.out.println("1. Xem tất cả điểm");
        System.out.println("2. Sắp xếp điểm");
        System.out.println("3. Tìm kiếm điểm");
        System.out.println("4. Thống kê điểm");
        System.out.println("5. Thoát");
        System.out.print("Lựa chọn của bạn: ");
        task = Integer.parseInt(sc.nextLine());
    }

    public static void Task() {
        switch (task) {
            case 1:
                System.out.println("Danh sách điểm:");
                for (int i = 0; i < n; i++) {
                    System.out.printf("Sinh viên %d: %.1f\n", i + 1, a[i]);
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
                    System.out.println("Đã sắp xếp tăng dần");
                } else {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i - 1; ++j) {
                            if (a[j + 1] > a[j]) {
                                float temp = a[j];
                                a[j] = a[j + 1];
                                a[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp giảm dần");
                }
                System.out.println();
                break;
            case 3:
                int index=-1;
                while (true) {
                    System.out.print("Nhập điểm cần tìm: ");
                    float score = Float.parseFloat(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        if (a[i] == score) {
                            index = i+1;
                            break;
                        }
                    }
                    if (index<0) System.out.println("Không tìm thấy, vui lòng tìm điểm khác !");
                    else break;
                }
                System.out.println("Tìm kiếm tuyến tính: Tìm thấy tại vị trí " + index);
                if (t==1) System.out.println("Tìm kiếm nhị phân (mảng tăng dần): Tìm thấy tại vị trí " + index);
                System.out.println();
                break;
            case 4:
                AverageScore=AverageScore/n;
                System.out.printf("Điểm trung bình: %.1f\n", AverageScore);
                System.out.printf("Điểm cao nhất: %.1f\n", maxScore);
                System.out.printf("Điểm thấp nhất: %.1f\n", +minScore);
                int cnt = 0;
                for (int i = 0; i < n; i++) if (a[i] > AverageScore) cnt++;
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
