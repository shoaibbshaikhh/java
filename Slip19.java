/*
import java.util.LinkedList;
import java.util.Scanner;
public class Slip19
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) 
        {
            numbers.add(scanner.nextInt());
        }

        System.out.println("Negative integers:");

        for (Integer num : numbers) 
        {
            if (num < 0)
            {
                System.out.println(num);
            }
        }
    }
}
*/


/*
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Slip19 extends HttpServlet 
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        boolean isValidUser = validateUser(username,password);

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        if(isValidUser) 
        {
            out.println("<h2>Welcome, " + username + "!</h2>");
        } 
        else 
        {
            out.println("<h2>Invalid username or password!</h2>");
        }
        out.println("</body></html>");
    }
    private boolean validateUser(String username, String password) 
    {
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ty92","ty92","ty92");

            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Users WHERE username=? AND password=?");

            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

            if(rs.next())
                return true;

            rs.close();
            pstmt.close();
            con.close();

        } 
        catch (SQLException | ClassNotFoundException e) 
        {
            System.out.println(e);
        }
        return false;
    }
}
*/