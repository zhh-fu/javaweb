import java.io.Serializable;
import java.io.*;

public class SerializableTest implements Serializable
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
        SerializableTest mybox = new SerializableTest();
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
    }
}
