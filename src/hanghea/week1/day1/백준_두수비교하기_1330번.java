package hanghea.week1.day1;

import java.util.Scanner;

public class 백준_두수비교하기_1330번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b ? ">" : ((a == b) ? "==" : "<"));
    }
}
