import java.util.Scanner;

public class YatzyUI {

    public static void main(String[]args)
    {   Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of players");
        int noOfPlayers=scanner.nextInt();
        for(int i=1;i<noOfPlayers;i++)
        {
            System.out.println("Enter the name of the player");
        }
    }
}
