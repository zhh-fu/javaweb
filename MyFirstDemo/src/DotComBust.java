import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.*;

/*class  DVDPlayer
{
    boolean canRecord =false;

    void recordDVD()
    {
        System.out.println("DVD recording");
    }
}*/


public class DotComBust
{

    private GamePlayer player=new GamePlayer();
    private ArrayList<DotCom> dotComsList=new ArrayList<>();
    private int numOfGuesses=0;


    private void setUpGame()
    {
        DotCom one=new DotCom();
        one.setName("Pets.com");

        DotCom two=new DotCom();
        two.setName("AskMe.com");

        DotCom three=new DotCom();
        three.setName("GO2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink the three DotComs.");
        System.out.println("They are:Pet.com,AskMe.com,Go2.com.");
        System.out.println("Try to sink them all in the fewest number of guesses.");
    }

    private void startPlaying()
    {
        while (!dotComsList.isEmpty())
        {
            String userGuess=player.getPlayerInput("Please enter the coordinate: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess)
    {
        numOfGuesses++;
        String result="miss";

        for(DotCom dotComToTest:dotComsList)
        {
            result=dotComToTest.checkYourself(userGuess);
            if(result.equals("shot at"))
                break;
            if (result.equals("kill"))
            {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame()
    {
        System.out.println("All the DotCom have been sunk!The game will finish.");
        System.out.println("You have shot " + numOfGuesses + "times.");

    }

    public static void main(String[] arg) {

        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
        /*BeerSong [] h= new BeerSong[5];
        int z=0;

        while (z<4)
        {
            z=z+1;
            h[z]=new BeerSong();
            h[z].name ="basdas";
            if(z==1)
                h[z].name="frgr";
            if (z==2)
                h[z].name="xdfsdf";
            System.out.println(z+ h[z].name+" is a good beer.");
        }*/
        //DVDPlayer d=new DVDPlayer();
        //d.canRecord= true;

        /*if(d.canRecord==true)
            d.recordDVD();
        System.out.println("It's wrong");*/

        /*int beeNum = 99;
        String word ="boottles";

        while (beeNum>0)
        {
            if (beeNum==1)
                word="bottle";

            System.out.println(beeNum+" "+word+" of beer on the wall");
            System.out.println(beeNum+" "+word+" of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around");
            beeNum--;

            if (beeNum>0)
                System.out.println(beeNum+" "+word+" of beer on the wall");
            else
                System.out.println("No more bottles of beer on the wall");
        }*/
        //double rad1 = (Math.random()*5);
        //Random rad2=new Random(25);
        //System.out.println(num[3]+num[7]);
        /*int[] location={2,3,4};
        for (int i:location) {
            System.out.println("The index is "+ i):
        }*/
        /*GamePlayer player1=new GamePlayer();
        int numOfGuess=0;

        DotCom dot=new DotCom();

        //int randomLocations=(int) (Math.random()*5);
        ArrayList<String> locations=new ArrayList<String>(Arrays.asList("1","3","5"));
        //String a=new String("1");
        //String b=new String("2");
        //String c=new String("3");
        //locations.add("1");
        //locations.add("3");
        //locations.add("2");
        int length=locations.size();
        dot.setLocationCells(locations);

        boolean isAlive=true;
        while (isAlive)
        {
            String guess=player1.getPlayerInput("Please enter a number:");
            String result=dot.checkYourself(guess);
            numOfGuess++;
            if(result.equals("kill"))
            {
                isAlive=false;
                System.out.println("You have killed the DotCom.");
                System.out.println("You have tryed "+numOfGuess+" times.");
                System.out.println("And your scores is: "+(double)length/numOfGuess+".");
                System.out.println("The total times is: "+length);
            }
        }*/
}
