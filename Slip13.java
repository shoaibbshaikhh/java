/*
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
public class Slip13 extends JFrame 
{
    private JTable table;
    public Slip13() 
    {
        setTitle("Project Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        displayData();

        setVisible(true);
    }
    private void displayData() 
    {
    try 
    {
      Connection connection = DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty32","ty32","ty32");
      Statement statement = connection.createStatement();     
      ResultSet resultSet = statement.executeQuery("SELECT * FROM project");

      ResultSetMetaData metaData = resultSet.getMetaData();
      int columnCount = metaData.getColumnCount();
      DefaultTableModel model = new DefaultTableModel();

      for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) 
      {
        model.addColumn(metaData.getColumnName(columnIndex));
      }

      while (resultSet.next()) 
      {
        Object[] row = new Object[columnCount];
        for (int i = 0; i < columnCount; i++) 
        {
          row[i] = resultSet.getObject(i + 1);
        }
        model.addRow(row);
      }
      table.setModel(model);
      resultSet.close();
      statement.close();
      connection.close();
    } 
    catch (SQLException e) 
    {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(Slip13::new);
    }
}
*/

/*
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadLifeCycle extends Thread 
{
    private String threadName;
    
    ThreadLifeCycle(String threadName) 
    {
        this.threadName = threadName;
    }  
    public void run() 
    {
        Random rand = new Random();
        int sTime = rand.nextInt(5000);
        System.out.println(threadName + " is created.");
        System.out.println("Sleep time of " + threadName + " is: " + sTime + "ms.");
        try {
            Thread.sleep(sTime);
        } catch (InterruptedException ex) 
        {
            Logger.getLogger(ThreadLifeCycle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(threadName + " is dead.");
    }
}

public class Slip13
{
    public static void main(String[] args) 
    {
        ThreadLifeCycle t1 = new ThreadLifeCycle("First");
        ThreadLifeCycle t2 = new ThreadLifeCycle("Second");
        ThreadLifeCycle t3 = new ThreadLifeCycle("Third");       
        t1.start();
        t2.start();
        t3.start();
    }
}
*/