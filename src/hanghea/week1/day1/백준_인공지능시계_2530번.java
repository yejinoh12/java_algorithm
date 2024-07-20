package hanghea.week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_인공지능시계_2530번 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");
        int second = Integer.parseInt(bf.readLine());

        int[] time = new int[3];

        for(int i = 0; i < 3; i++){
            time[i] = Integer.parseInt(str[i]);
        }

        int timeToSecond = (time[0]*3600+time[1]*60+time[2])+second;

        time[0] = (timeToSecond / 3600) % 24;
        time[1] = (timeToSecond % 3600) / 60;
        time[2] = timeToSecond % 60;

        for(int i : time){
            System.out.print(i + " ");
        }
    }
}
