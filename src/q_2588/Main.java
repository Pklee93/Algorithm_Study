package q_2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int answer = 0;
        int position = 1;
        while (B != 0) {
            int temp = A * (B % 10);
            answer += temp * position;
            System.out.println(temp);;
            B /= 10;
            position *= 10;
        }
        System.out.println(answer);
    }
}
