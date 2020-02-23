import java.util.ArrayList;
public class DotCom
{
    //private  int[] locationCells;
    //int numOfHits=0;
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs){
        locationCells=locs;
    }

    public void  setName(String n)
    {
        name = n;
    }
    public String checkYourself(String stringGuess){
        //int guess=Integer.parseInt(stringGuess);
        String result="miss";
        int index=locationCells.indexOf(stringGuess);
        if (index>=0) {
            locationCells.remove(index);
            result = "shot at";
        }
        else
            result="miss";

        if(locationCells.isEmpty())
        {
            result="kill";
            System.out.println("You have sucked the "+ name + " :(");
        }


        //System.out.println(locationCells.size());
        //System.out.println(index);
        //System.out.println(locationCells.isEmpty());
        System.out.println(result);
        return result;
    }
}
