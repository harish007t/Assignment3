import java.util.Scanner;

class Guesser
{
    int guessNum;

    int guessNum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("guesser kindly guess number between 1 to 100 :");
        guessNum = scan.nextInt();
        if(guessNum>0 && guessNum<101){
            System.out.println("vaild number!");
        }
        else{
            System.out.println("invaild number :");
            System.out.println("Guess agian");
            guessNum();
        }
        return guessNum;

    }
}

    class Player
    {
        int guessNum;

        int guessNum()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("player kindly guess number between 1 to 100 :");
            guessNum = scan.nextInt();
            if(guessNum>0 && guessNum<101){
                System.out.println("vaild number!");
            }
            else{
                System.out.println("player guess the number within range 1 to 100");
                System.out.println("Guess agian");
                guessNum();
            }

            return guessNum;
    
        }  
    }

    class Umpire
    {
        int numFromGuesser;
        int numFromPlayer1;
        int numFromPlayer2;
        int numFromPlayer3;

       void collectNumFromGuesser()
       {
            Guesser g = new Guesser();
            numFromGuesser = g.guessNum();
       }
       void collectNumFromPlayer()
       {
           Player p1 = new Player();
           Player p2 = new Player();
           Player p3 = new Player();
           numFromPlayer1 = p1.guessNum();
           numFromPlayer2 = p2.guessNum();
           numFromPlayer3 = p3.guessNum();

       }
       void compare()
       {
        if (numFromGuesser == numFromPlayer1) {
            if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3){
                System.out.println("All players won the game "); 
            }
           else if(numFromGuesser==numFromPlayer2){

               System.out.println("Player1 and player2  won the game");
           }
           else if(numFromGuesser==numFromPlayer3){

               System.out.println("Player1 and player3  won the game");
           }
           else{
            System.out.println("Player1 is won the game");

           }

        }
        else if(numFromGuesser == numFromPlayer2){
            if(numFromGuesser == numFromPlayer3){

                System.out.println("Player2 and player3 is won the game");
            }
            else{
                System.out.println("player2 is won the game");
            }
        }
        else if(numFromGuesser == numFromPlayer3){
            System.out.println("Player3 is won the game");
        }
        else {
            System.out.println("game lost try agian");
        }

       }
    }
        

public class GuesserGame 
{

    public static void main(String[] args) {
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    
    }
}

