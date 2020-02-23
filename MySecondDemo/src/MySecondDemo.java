public class MySecondDemo
{
    public static void main(String[] arg)
    {
        Stu test=new Stu();
        Him test1=new Him();

        test.setName("Lin Qinhua");
        test.setAge(24);

        test1.setName("Fu Zhihang");

        System.out.println(test.name);
        System.out.println(test.getAge());
        System.out.println(test1.getName());
        System.out.println(test1.getAge());

        test1.numSet();

    }
}

class Stu
{
    public String name;
    private int age;
    public int  num;
    public final static int a=5;


    public Stu(){}
    public Stu(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public void numSet()
    {
        num=45;
        System.out.println("父类的num是:"+num);
    }
}

class Him extends Stu
{
    int num;

    @Override
    public void setName(String aname) {
        this.name=aname;
    }

    @Override
    public void numSet() {
        super.numSet();
        //num=785;
        System.out.println("子类的num是:"+num);
        System.out.println("FU类的num是:"+super.num);
    }
}
