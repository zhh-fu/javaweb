import java.io.*;
public class FileTest {

    public static void main(String[] args)
    {

        File readFile=new File("D:\\java test documents\\FileTestProject\\Test.txt");
        readFile.mkdir();

        if(readFile.isDirectory())
        {
            String[] fileContent=readFile.list();
            for (int i=0;i<fileContent.length;i++)
                System.out.println(fileContent[i]);
        }

        System.out.println(readFile.getAbsolutePath());

        try
        {
            FileReader fileReader=new FileReader(readFile);
            BufferedReader reader=new BufferedReader(fileReader);

            String outputFile=null;
            while ((outputFile=reader.readLine())!=null)
                System.out.println(outputFile);
            reader.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
