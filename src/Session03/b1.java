package Session03;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String CustomerName,ProductName;
        Double price;
        Long ProductAmount;
        boolean Card;

        System.out.println("========= NHẬP THÔNG TIN HÓA ĐƠN =========");
        System.out.print("Nhập tên khách hàng: ");
        CustomerName = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        ProductName = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng mua: ");
        ProductAmount =Long.parseLong(sc.nextLine());
        System.out.print("Khách có thẻ thành viên? (true/false): ");
        Card = Boolean.parseBoolean(sc.nextLine());
        System.out.println("========= HÓA ĐƠN =========");

        double TotalPrice = price * ProductAmount;

        System.out.println("Khách hàng: "+CustomerName);
        System.out.println("Sản phẩm: "+ProductName);
        System.out.println("Số lượng: "+ProductAmount);
        System.out.printf("Đơn giá: %.2f VND\n",price);
        System.out.printf("Thành tiền: %.2f VND\n" ,TotalPrice);
        System.out.printf("Giảm giá thành viên (10 phần trăm): %.2f\n",(Card ?(TotalPrice)/10:0));
        System.out.printf("Tiền VAT (8 phần trăm): %.2f\n",TotalPrice*8/100);
        System.out.printf("Tổng thanh toán: %.2f VND\n",(TotalPrice-(Card ?(TotalPrice)/10:0)+TotalPrice*8/100));

        System.exit(0);
    }
}
