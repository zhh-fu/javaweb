import java.util.Scanner;
public class GamePlayer {
    public String getPlayerInput(String tips)
    {
        String inputLine=null;
        System.out.print(tips+" ");
        Scanner sc = new Scanner(System.in);
        inputLine = sc.nextLine();
        if (inputLine.length()==0) {
            return null;
        }
        return  inputLine;
    }
}
