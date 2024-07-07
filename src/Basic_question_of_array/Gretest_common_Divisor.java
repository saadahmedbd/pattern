package Basic_question_of_array;

public class Gretest_common_Divisor {
    public static void GCD(int n1, int n2){
        int n=2000;
        int gcd=1;
      //  ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n1%i==0 && n2% i==0){
                gcd=i;

                System.out.println(gcd);
            }



        }


    }

    public static int gcdByEuclidsAlgortihms(int n1, int n2){
        if(n2==0){
            return n1;
        }
        return gcdByEuclidsAlgortihms(n2, n1%n2);
    }
    public static void main(String[] args) {
        //GCD(150, 200);
        System.out.println( gcdByEuclidsAlgortihms(200, 250));
    }
}
