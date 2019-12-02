package Programs;


import java.io.*;


public class righttri
{

    public static void main(String args[])
    {
        int i, j;
        for(i=0; i<3; i++)
        {

            for(j=3; j>=i; j--)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


}
