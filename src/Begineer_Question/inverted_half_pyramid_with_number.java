package Begineer_Question;

public class inverted_half_pyramid_with_number {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //or
        for(int x=1;x<=n;x++){
            for(int y=1;y<=n-x+1;y++){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
