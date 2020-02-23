import java.util.Date;
import java.util.Calendar;
public class TestDemo {
    Integer i;
    int j;
    int q;
    public static void main(String[] arg){
        TestDemo bgn=new TestDemo();
        bgn.go();
        //Date t=new Date();
        String time=String.format("%tc", new Date());
        System.out.println(time);
        Calendar c=Calendar.getInstance();
        System.out.println("the time is:"+c.get(c.AM_PM));
    }

    public void go(){
        j=1;
        System.out.println(j);
        String s= String.format("I have %10.2f, bugs to fix",45112.23425);
        System.out.println(s);


    }
}
