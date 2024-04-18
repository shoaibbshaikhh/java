/*
import java.io.*;
public class Slip08 extends Thread
{ 
	String str;
	int n;
	Slip08(String str,int n)
	{ 
	   this.str=str;
	   this.n=n;
	}	
	public void run()
	{
	   try
	   {
              for (int i=0;i<n;i++)
              {
                 System.out.println(getName()+" : "+i+" : "+str);
	      }
	   }
	   catch(Exception e)
	   {
	     e.printStackTrace();
	   }
	}
	public static void main(String args[])
	{
	    Slip08 t1=new Slip08("COVID19",10);
	    Slip08 t2=new Slip08("LOCKDOWN2020",20);
	    Slip08 t3=new Slip08("VACCINATED2021",30);
	     
	    t1.start();
	    t2.start();
	    t3.start();
	}
}
*/
