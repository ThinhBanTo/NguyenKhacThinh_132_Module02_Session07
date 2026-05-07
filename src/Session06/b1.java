package Session06;

import java.util.*;
import java.io.*;

public class b1 {
    static Scanner sc = new Scanner(System.in);
    static int choice, cnt = 0;
    static ArrayList<Float> listScore = new ArrayList<>();
    static Float minScore = 10F, maxScore = 0F, totalScore = 0F;

    public static void menu() {
        System.out.print("****************** QUẢN LÝ ĐIỂM SV ******************\n" +
                "1. Nhập danh sách điểm sinh viên\n" +
                "2. In danh sách điểm\n" +
                "3. Tính điểm trung bình của các sinh viên\n" +
                "4. Tìm điểm cao nhất và thấp nhất\n" +
                "5. Đếm số lượng sinh viên đạt và trượt\n" +
                "6. Sắp xếp điểm tăng dần\n" +
                "7. Thống kê số lượng sinh viên giỏi và xuất sắc\n" +
                "8. Thoát\n" +
                "Lựa chọn của bạn: ");
        choice = Integer.parseInt(sc.nextLine());
    }

    public static void option() {
        if (choice > 1 && (listScore.isEmpty())) {
            System.out.println("Bạn chưa nhập bất kì thông tin sinh viên nào!\nVui lòng chọn option 1 để thêm");
            return;
        }
        switch (choice) {
            case 1:
                System.out.println("-----------------------------------------------");
                System.out.println("Bắt đầu nhập điểm các sinh viên (Bấm -1 để kết thúc): ");
                while (true) {
                    System.out.print("Sinh viên thứ " + (cnt + 1) + ": ");
                    Float score = Float.parseFloat(sc.nextLine());
                    if (score == -1) {
                        System.out.println("---------------------------------------------");
                        return;
                    } else cnt++;
                    minScore = Math.min(minScore, score);
                    maxScore = Math.max(maxScore, score);
                    totalScore += score;

                    listScore.add(score);
                }
            case 2:
                System.out.println("---------------------------------------------");
                System.out.println("Hiển thị danh sách điểm: ");
                for (Float score : listScore) {
                    System.out.println(score);
                }
                System.out.println("---------------------------------------------");
                break;
            case 3:
                System.out.println("---------------------------------------------");
                System.out.println("Điểm trung bình các sinh viên là: " + totalScore / cnt);
                System.out.println("---------------------------------------------");
                break;
            case 4:
                System.out.println("---------------------------------------------");
                System.out.println("Điểm cao nhất của các sinh viên là: " + maxScore);
                System.out.println("Điểm thấp nhất của các sinh viên là: " + minScore);
                System.out.println("---------------------------------------------");
                break;
            case 5:
                System.out.println("---------------------------------------------");
                int PassCnt = 0, NotPassCnt = 0;
                for (Float score : listScore) {
                    if (score >= 5) PassCnt++;
                    else NotPassCnt++;
                }
                System.out.println("Số sinh viên đạt là: " + PassCnt);
                System.out.println("Số sinh viên không đạt là: " + NotPassCnt);
                System.out.println("---------------------------------------------");
                break;
            case 6:
                System.out.println("---------------------------------------------");
                listScore.sort(Comparator.naturalOrder());
                System.out.println("Danh sách điểm đã được sắp xếp tăng dần, vui lòng chọn option 2 để hiển thị lại danh sách!");
                System.out.println("---------------------------------------------");
                break;
            case 7:
                System.out.println("---------------------------------------------");
                int goodScore = 0;
                for (Float score : listScore) {
                    if (score >= 8) goodScore++;
                }
                System.out.println("Số lượng sinh viên giỏi và xuất sắc: "+goodScore);
                System.out.println("---------------------------------------------");
                break;
            case 8:
                System.out.println("Thoát thành công !");
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        while(true) {
            menu();
            option();
        }
    }
}
