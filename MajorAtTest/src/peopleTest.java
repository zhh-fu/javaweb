import java.util.Collections;
import java.util.*;
import java.text.Collator;
import com.testagain.People;

public class peopleTest {
    public static void main(String[] args) {
        List<People> listp=new ArrayList<People>();
        People p1=new People("新白娘子传奇", 45);
        People p2=new People("光辉岁月", 47);
        People p3=new People("在他乡", 85);
        People p4=new People("笨小孩", 47);
        People p5=new People("光阴的故事",47);
        listp.add(p1);
        listp.add(p2);
        listp.add(p3);
        listp.add(p4);
        listp.add(p5);
        listp.add(new People("奔波儿灞",45));
        listp.add(new People("yangmi",35));
        listp.add(new People("火国",5000));
        listp.add(new People("四庆",3000));
        Collections.sort(listp,new nComparator());
        myprint(listp);
    }

    public static void myprint(List<People> list){
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println("\t"+it.next());
        }
    }

    static class nComparator implements Comparator{
        public int compare(Object  o1, Object o2){
            People p1=(People)o1;
            People p2=(People)o2;
            return Collator.getInstance(Locale.CHINESE).compare(p1.getName(),p2.getName());
            //return toUTF_8(p1.getName()).compareTo(toUTF_8(p2.getName()));
//先年龄比较降序  年龄相同然后名字比较升序
            //int result=p1.getAge()>p2.getAge()?-1:(p1.getAge()==p2.getAge()?0:1);//降序
            //int result=p1.getAge()>p2.getAge()?1:(p1.getAge()==p2.getAge()?0:-1);//升序
            /*if(result==0){
                result=toUTF_8(p1.getName()).compareTo(toUTF_8(p2.getName()));
            }
            return result;*/
        }
    }
    //中文进行比较 需要把字符串转换编码为iso-8859-1
    /*private static String toUTF_8(String str) {
        try {
            return new String(str.getBytes(), "ISO-8859-1");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }*/
}