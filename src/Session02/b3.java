package Session02;
import java.util.*;
import java.io.*;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        if (n<0) n=-n;
        while (n!=0) {
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
