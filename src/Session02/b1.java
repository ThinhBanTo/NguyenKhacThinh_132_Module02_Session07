package Session02;
import java.util.Scanner;
public class b1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        while(true) {
            System.out.print("Nhập vào số nguyên dương N = ");
            n=Integer.parseInt(input.nextLine());
            if (n<=0) System.out.println("Số nhập vào không hợp lệ");
            else break;
        }
        int sum=0;
        for (int i=1;i<=n;i++) sum+=i;
        System.out.println("Tổng các số từ 1 đến "+n+" là: "+sum);
    }
}
