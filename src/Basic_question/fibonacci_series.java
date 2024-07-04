package Basic_question;

public class fibonacci_series {
    public static int fibonacci(int n){
      if(n==0 || n==1){
          return n;
      }
      return fibonacci(n-1) +fibonacci(n-2);
    }
    public static void fibo(int n1){
        int n2=0;
        int n3=1;
        for(int i=0;i<n1;i++){
            System.out.println(n3+" ");
            int result =n2+n3;
            n2=n3;
            n3=result;
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        fibo(9);
    }
}
