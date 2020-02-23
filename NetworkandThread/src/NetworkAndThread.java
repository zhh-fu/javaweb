import java.io.*;
import java.net.*;
public class NetworkAndThread
{
    public void go()
    {
        try
        {
            Socket chatSocket=new Socket("127.0.0.1",4242);
            InputStreamReader streamReader=new InputStreamReader(chatSocket.getInputStream());
            BufferedReader reader=new BufferedReader(streamReader);

            String receiveStream =null;
            receiveStream=reader.readLine();
            System.out.println("Today you should :" + receiveStream);
            reader.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        NetworkAndThread client = new NetworkAndThread();
        client.go();
    }
}
