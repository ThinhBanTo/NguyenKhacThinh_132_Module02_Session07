package Session02;

import java.util.*;
import java.io.*;

public class b4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[3];
        while (true) {
            System.out.print("Nhập vào 3 cạnh của tam giác: ");
            for (int i = 0; i < 3; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            if (arr[0] + arr[1] <= arr[2]) System.out.println("Ba cạnh không tạo thành tam giác");
            else break;
        }
        if (arr[0] == arr[1] && arr[1] == arr[2]) System.out.println("Tam giác đều");
        else if (arr[0] == arr[1] || arr[1] == arr[2]) System.out.println("Tam giác cân");
        else if (arr[2] * arr[2] == arr[1] * arr[1] + arr[0] * arr[0]) System.out.println("Tam giác vuông");
        else System.out.println("Tam giác thường");
    }
}

