package Basic_question_of_array;

public class greaterOfTwo {
    public static void greater(int n1, int n2){
        if(n1>n2){
            System.out.println(n1 +" bigger than "+n2);
        }else if (n1==n2){
            System.out.println(n1+" equal to "+n2);
        }else {
            System.out.println(n2+" bigger than "+n1);
        }
    }
    public static void main(String[] args) {
        greater(2,3);
    }
}
