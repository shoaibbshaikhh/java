/*
public class Slip18
{
  public static void main(String arg[])
  {
    Thread t=Thread.currentThread();
    System.out.println("Current Thread:"+t);

    System.out.println ("After the name is Changed:"+t);
    try 
    {
        for(int i=10;i>0;i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
  }
}
*/


/*

import java.io.*; 
import javax.servlet.*;
import javax.servlet.http.*;
public class count extends HttpServlet 
{
    static int count=0,c2=0;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException 
    {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String name=request.getParameter("t1"); 
      Cookie c1=new Cookie("count",String.valueOf(count));
      c2=Integer.parseInt(c1.getValue());
      if(c2==0)
      {
        out.println("Welcome="+name); 
        count++;
      }
      else
      { 
        c1=new Cookie("count",String.valueOf(count)); 
        count++;
        out.println("Welcome="+name+"\t"+count); 
      }
    }
}


HTML Code
<html>
<body>
<form action="http://localhost:8080" method="get">
      Username:<input type="text" name="t1">
<input type="submit" >
</form>
</body>
</html>
*/