/*
import java.io.*;
import java.util.*;
import java.lang.*;
class Slip14
{
    static class SearchThread extends Thread
    {
        public final File file;
        public final String searchString;

        public SearchThread(File file, String searchString) 
        {
            this.file = file;
            this.searchString = searchString;
        }
        @Override
        public void run() 
        {
            try 
            {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String line;
                int lineNumber = 1;
                while ((line = br.readLine()) != null) 
                {
                    if (line.contains(searchString)) 
                    {
                        System.out.println("Found in file Name : " + file.getName() + "\n  Line No. : " + lineNumber);
                    }
                    lineNumber++;
                }
            } 
            catch (IOException e)
            {
            }
            
        }
    }
    public static void main(String[] args) 
    {
        File folder = new File(".");
        File[] files = folder.listFiles();
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter String to search : ");
        String m = sc.next();
        if (files != null) 
        {
            for (File file : files) 
            {
                if (file.isFile() && file.getName().endsWith(".txt")) 
                {
                    SearchThread s = new SearchThread(file, m);
                    s.start();
                }
            }
        }
    }
}
*/

/*
HTML FILE
<html>
<body>
<form method=post action="Slip7.jsp">
Enter Any Number : <Input type=text name=num>
<input type=submit value=Display>
</form>
</body>
</html>


JSP FILE:
<%@page contentType="text/html" pageEncoding="UTF-8">
<!DOCTYPE html>
<html>
<body>
<%! intn,rem,r; %>
<% n=Integer.parseInt(request.getParameter("num"));
if(n<10)
{
  out.println("Sum of first and last digit is ");
  %><font size=18 color=red><%= n %>
  <%
}
else
{
  rem=n%10;
  do
{
  r=n%10;
  n=n/10;
}
while(n>0);
n=rem+r;
out.println("Sum of first and last digit is ");
%><font size=18 color=red><%= n %>
<%
}
%>
</body>
</html>
*/