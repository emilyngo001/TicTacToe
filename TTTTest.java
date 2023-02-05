package TicTacToe;

import java.util.*;
public class TTTTest
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String player1, player2;
        int player1num;
        String response = "n";
        

        //instructions for the game
        System.out.println("Hi! Welcome to TTT (Tic-Tac-Toe)!!");

        do
        {
            TTT test = new TTT();

            System.out.println("How to play: Please enter the number of the space you want to put your O's and X's in :)");
            System.out.println("Have fun!");
            System.out.println("----------------------------------------------------------------------------------------");

            System.out.println("Please select the options below for Player 1:");
            System.out.println("(1) \"O\"");
            System.out.println("(2) \"X\"");
            System.out.print("Enter the option (1 or 2): ");
            int selection = scan.nextInt();
            System.out.println("Thank you!");

            if(selection==1)
            {
                player1 = "O";
                player2 = "X"; 
            }
            else
            {
                player1 = "X";
                player2 = "O";
            }
            for(int i = 0; i<4; i++)
            {
                //player 1
                System.out.println("Player 1, please enter in the space (number) you want to put \""+player1+"\": ");
                test.board();
                player1num = scan.nextInt();
                test.assign(player1num,player1);
                System.out.println("Updated Board:");
                System.out.println("==============");
                test.board();
                if(test.check()&&test.getPlayer().equals(player1))
                {
                    System.out.println("Player 1 won!");
                    break;
                }

                //player 2
                System.out.println("Player 2, please enter in the space (number) you want to put \""+player2+"\": ");
                test.board();
                player1num = scan.nextInt();
                test.assign(player1num,player2);
                System.out.println("Updated Board:");
                System.out.println("==============");
                test.board();
                if(test.check()&&test.getPlayer().equals(player2))
                {
                    System.out.println("Player 2 won!");
                    break;
                }
                
            }
            if(!test.check())
            {
                System.out.println("Draw!");
            }
            
            System.out.println("Do you want to play again?(y/n)");
            response = scan.next();
        }while(response.equalsIgnoreCase("y"));

        System.out.println("Thank you for playing :)");
    }

}