package source;

import java.sql.*;

public class setConnection {
    public Connection getConnection()
    {
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/databasetest?useSSL=false";
            String username = "root";
            String password = "fuzhihang..";
            connection = DriverManager.getConnection(url, username, password);
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (SQLException ex)
        {
            System.out.print("数据库连接失败");
            ex.printStackTrace();
        }
        return connection;
    }

    public int count()
    {
        int count=0;
        Connection connection=getConnection();
        String sql="select count(*) from tb_books";
        try
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            if (resultSet.next())
            {
                count=resultSet.getInt(1);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return count;
    }
}

