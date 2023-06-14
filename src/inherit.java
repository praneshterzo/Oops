import java.lang.*;
import java.util.Scanner;
public class inherit {
    public static void main(String[] args) {

        int x, y;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1:");
        x = sc.nextInt();
        System.out.print("Number 2:");
        y = sc.nextInt();
        Main m1 = new Main(x, y);
        sum=m1.add();
        System.out.println(m1.add());
        operations o1 = new operations(x, y);
        System.out.println(sum-o1.sub());
    }
}