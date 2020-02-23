import java.text.Collator;
import java.util.*;
import java.util.Comparator;
public class ChineseSortTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub  
        Comparator<Object> com=Collator.getInstance(Locale.CHINA);
        String[] newArray={"中山","汕头","广州","安庆","阳江","南京","武汉","北京","安阳","北方","茶叶","华中"};
        List<String> list = Arrays.asList(newArray);
        Collections.sort(list, com);
        for(String i:list){
            System.out.print(i+"  ");
        }
    }
}