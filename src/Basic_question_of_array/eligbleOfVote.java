package Basic_question_of_array;

public class eligbleOfVote {
    public static void Vote(int age){
        if (age>18){
            System.out.println("eligble of given vote");
        }else{
            System.out.println("do not eligble");
        }
    }
    public static void main(String[] args) {
        Vote(19);
    }
}
