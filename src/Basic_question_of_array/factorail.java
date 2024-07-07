package Basic_question_of_array;

public class factorail {
    public static void fact(int n){
        int n1=1;
        if(n<0){
            System.out.println("invalid");
        }
        for (int i=1;i<=n;i++){
            n1=n1+i;
        }
        System.out.println(n1);
    }
    public static void main(String[] args) {
        fact(-1);
    }
}
