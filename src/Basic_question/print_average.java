package Basic_question;

import java.util.Scanner;

public class print_average {
    public static void averge(int n1, int n2, int n3){
        int sum = n1+n2+n3;
        int result =sum/3;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2 = sc.nextInt();
        int n3 =sc.nextInt();
        averge(n1, n2, n3);
    }
}
