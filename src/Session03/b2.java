package Session03;

import java.util.*;
import java.io.*;

public class b2 {
    static int choice,cnt=0;
    static float sum=0,maxScore=0,minScore=10;
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("**************** MENU NHẬP ĐIỂM ****************");
        System.out.println("1.    Nhập điểm học viên");
        System.out.println("2.    Hiển thị thống kê");
        System.out.println("3.    Thoát");
        System.out.print("Lựa chọn của bạn: ");
        choice = Integer.parseInt(input.nextLine());
        System.out.println();
    }

    public static void task(int n) {
        switch (n) {
            case 1:
                System.out.println("----- Nhập điểm học viên (nhập -1 để dừng) -----");

                while (true) {
                    System.out.print("Nhập điểm: ");
                    float score = Float.parseFloat(input.nextLine());
                    if (score == -1) break;
                    else if ((score < 0 || score > 10)) {
                        System.out.println("Điểm không hợp lệ. Nhập lại!");
                        continue;
                    }

                    cnt++;
                    sum += score;
                    minScore = Math.min(minScore, score);
                    maxScore = Math.max(maxScore, score);

                    String rank;
                    if (score >= 9) rank = "Xuất sắc";
                    else if (score >= 8) rank = "Giỏi";
                    else if (score >= 7) rank = "Khá";
                    else if (score >= 5) rank = "Trung Bình";
                    else rank = "Yếu";
                    System.out.println("Học lực: "+rank);
                    System.out.println();
                }

                break;

            case 2:
                if (cnt == 0) System.out.println("Chưa có dữ liệu");
                else {
                    System.out.println("Số học viên đã nhập: " + cnt);
                    System.out.printf("Điểm trung bình: %.2f\n", sum / cnt);
                    System.out.printf("Điểm cao nhất: %.2f\n",maxScore);
                    System.out.printf("Điểm thấp nhất: %.2f\n", minScore);
                    System.out.println();
                }

                break;

            case 3:
                System.out.println("Kết thúc chương trình.");
                System.exit(0);

            default:
                System.out.println("Bạn chỉ được phép chọn từ 1 đến 3");
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
