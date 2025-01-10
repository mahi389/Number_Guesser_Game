import java.util.Scanner;
class rangen{
    public int genrate(int max,int min){
        return (int) (Math.random()*(max - min + 1) + min);
    }
}
public class NumberGuesser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        rangen rg = new rangen();
        int totalAttempts = 0;
        int win = 0;

        while (true) {
            System.out.println("Enter the maximum number");
            int max = sc.nextInt();
            System.out.println("Enter the minimum number");
            int min = sc.nextInt();
            sc.nextLine();

            int cnum = rg.genrate(max,min);
            int attempts = 0 ;

            while (true) {
                System.out.println("guess a number between "+max+"and"+min);
                int gnum = sc.nextInt();
                if (gnum > cnum) {
                    System.out.println("Its Greater");
                }else if (gnum < cnum){
                    System.out.println("Its Lower");
                }else{
                    System.out.println("Correct Guess");
                    win++;
                    break;
                }
            }
totalAttempts += attempts;
System.out.println("Attempt = " + attempts);
System.out.println("Wins = " +win);

double winrate = (double) win / totalAttempts;
System.out.printf("your winrate is %.2f%%\n",winrate);

System.out.println("Do you want to play again (yes/no)");
String playAgain = sc.next();
if(!playAgain.equalsIgnoreCase("yes")){
    sc.close();
    System.exit(0);
}
sc.nextLine();
        }
    }
}
