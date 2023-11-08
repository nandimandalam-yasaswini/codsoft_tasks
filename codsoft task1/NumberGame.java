import java.util.Scanner;

class rangen{
    public int genrate(int max,int min){
        return (int) (Math.random()*(max - min + 1) + min);
    }
}

public class NumberGame{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rangen rg = new rangen();
        int totalAttempts = 0;
        int win = 0;
        System.out.println("\n############################################################");
        System.out.println("Unlock the Mystery: Welcome to Our Number Guessing Game!");
        System.out.println("\n############################################################");
        while (true) {
            System.out.print("Enter the maximum number :");
            int max = sc.nextInt();
            System.out.print("Enter the minimum number :");
            int min = sc.nextInt();
            sc.nextLine();

            int cnum = rg.genrate(max, min);
            int attempts = 0;
            System.out.println("***Let's dive into the enigmatic world of numbers and begin our exciting game of mystery and strategy!***");
            while (true) {
                System.out.print("Guess a number between "+max+" and "+min+": ");
                int gnum = sc.nextInt();
                attempts++;

                if (gnum > cnum) {
                    System.out.println("your Guess is greater.please try again!");
                } else if (gnum < cnum){
                    System.out.println("your Guess is Lower.please try again!");
                }else{
                    System.out.println("Congratulations! Your guess is correct, and you've done an excellent job.");
                    win++;
                    break;
                }
            }
            totalAttempts += attempts;
            System.out.println("Attempts = " + attempts);
            System.out.println("Wins = " + win);

            double winrate = (double) win / totalAttempts*100;
            System.out.printf("Your winrate is %.2f%%\n",winrate);
            System.out.println("Thank you for participating! Best of luck, and keep up the great work!");
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