package Basic_question_of_array;

import java.util.Scanner;

public class circleRadiusAndCircumference {
    public static void circumference(int radius){

        double pi =3.1416;
        double result = 2* pi* radius;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        circumference(radius);
    }
}
