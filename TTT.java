package TicTacToe;

import javax.lang.model.util.ElementScanner14;

public class TTT 
{
    String[] list = {"1","2","3","4","5","6","7","8","9"};
    String player = null;
    
    public void board()
    {
        System.out.println(" --- --- ---");
        System.out.println("| "+list[0]+" | "+list[1]+" | "+list[2]+" |");
        System.out.println(" --- --- ---");
        System.out.println("| "+list[3]+" | "+list[4]+" | "+list[5]+" |");
        System.out.println(" --- --- ---");
        System.out.println("| "+list[6]+" | "+list[7]+" | "+list[8]+" |");
        System.out.println(" --- --- ---");
    }
    public void assign(int num, String player)
    {

        if(player.equalsIgnoreCase("X"))
        {
            list[num-1] = "X";
        }
        else
        {
            list[num-1] = "O";
        }
    }
    //new and improve not rlly: starting uni 2022
    public boolean check()
    {
        // for(int i = 0; i< list.length-1;i+=3)
        // {
        //     if(list[i].equals(list[i+1].equals(list[i+2]))
        //     {
        //         return true;
        //     }
        //     else
        //     {
        //         return false;
        //     }
        // }

        if(list[0].equals(list[4])&&list[0].equals(list[8]))
        {
            player = list[0];
            return true;
        }
        else if(list[2].equals(list[4])&&list[2].equals(list[6]))
        {
            player = list[2];
            return true;
        }
        else if(helper(1,2,3))
        {
            return true;
        }
        else if(helper(3,6,1))
        {
            return true;
        }
        
        return false;
    }
    public boolean helper(int num1, int num2, int num3)
    {
        boolean result = false;
        int count = 0;
        for(int i = 1; i<=3;i++)
        {
            
            if(list[count].equals(list[count+num1])&&list[count].equals(list[count+num2]))
            {
                result = true;
                player = list[count];
                break;
            }
            count+=num3;
        }
        return result;
    }
    public String get(int num)
    {
        return list[num];
    }
    public String getPlayer()
    {
        return player;
    }
    //summer:
    // public boolean check()
    // {
    //     if(list[0].equals(list[1])&&list[1].equals(list[2]))
    //     {
    //         return true;
    //     }
    //     else if(list[3].equals(list[4])&&list[3].equals(list[5]))
    //     {
    //         return true;
    //     }
    //     else if(list[6].equals(list[7])&&list[6].equals(list[8]))
    //     {
    //         return true;
    //     }
    //     else if(list[0].equals(list[3])&&list[0].equals(list[6]))
    //     {
    //        return true; 
    //     }
    //     else if(list[1].equals(list[4])&&list[1].equals(list[7]))
    //     {
    //         return true;
    //     }
    //     else if(list[2].equals(list[5])&&list[2].equals(list[8]))
    //     {
    //         return true;
    //     }
    //     else if(list[0].equals(list[4])&&list[0].equals(list[8]))
    //     {
    //        return true;
    //     }
    //     else if(list[2].equals(list[4])&&list[2].equals(list[6]))
    //     {
    //         return true;
    //     }
    //     return false;
    // }
    // public boolean draw()
    // {
    //     return false;
    // }

}
