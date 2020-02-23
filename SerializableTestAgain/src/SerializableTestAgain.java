import java.io.*;

public class SerializableTestAgain implements Serializable
{
    private int width;
    private int height;

    public void setWidth(int width)
    {
        this.width=width;
    }
    public  void setHeight(int height)
    {
        this.height=height;
    }

    public static void main(String[] args)
    {
        SerializableTestAgain mybox = new SerializableTestAgain();
        mybox.setHeight(32);
        mybox.setWidth(70);

        try
        {
            FileOutputStream fileStream= new FileOutputStream("Test.ser");
            ObjectOutputStream objectStream=new ObjectOutputStream(fileStream);
            objectStream.writeObject(mybox);
            objectStream.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        try
        {
            FileInputStream fileInputStream=new FileInputStream("Test.ser");
            ObjectInputStream os=new ObjectInputStream(fileInputStream);
            Object one = os.readObject();
            SerializableTestAgain reMyBox=(SerializableTestAgain) one;
            os.close();
            System.out.println(reMyBox.width);
            System.out.println(reMyBox.height);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

