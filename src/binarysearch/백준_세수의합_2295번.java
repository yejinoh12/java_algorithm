package binarysearch;

import java.util.Scanner;
import java.util.TreeSet;

public class 백준_세수의합_2295번 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }

        System.out.println(set);


    }
}
