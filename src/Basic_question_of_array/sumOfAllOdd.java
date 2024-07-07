package Basic_question_of_array;

public class sumOfAllOdd {
    public static void sumOddNumber(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumOddNumber(7);
    }
}
