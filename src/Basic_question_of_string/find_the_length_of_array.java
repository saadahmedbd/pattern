package Basic_question_of_string;

import java.util.Scanner;

public class find_the_length_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String Array[] = new String[size];
        int length=0;
        for(int i=0;i<size;i++){
            Array[i]=sc.next();
            length+=Array[i].length();
        }
        System.out.println(length);

    }
}
