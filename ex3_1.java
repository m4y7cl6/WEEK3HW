package extoken;
import java.util.*;
import java.io.*;

public class EXtoken 
{
    public static void main(String[] args) 
    {
    int n=0;
    String input;
    ArrayList<String> arr = new ArrayList<String>();
    ArrayList<String> arr1 = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("���s���J�X���r��:");
    n = scanner.nextInt();
    int sum =0;
    for(int i=0;i<n;i++)
    {
        System.out.println("�гs���J�r��:");
        Scanner Intput = new Scanner(System.in);
        input = Intput.nextLine();
        input=input.toLowerCase();
        String [] tokens =input.split("[:|!|\\.|,|\\?\\s]+");
        for (String token:tokens) 
        {
            if(token.matches("[a-zA|\\.]*") )
            {
                if(!arr1.contains(token))
                    arr1.add(token);
            }
            try
            {
                int A = Integer.parseInt(token);
                arr.add(token);
                sum += A;
            }
            catch(NumberFormatException e)
            {}
        }
    }
    System.out.print("�r�ꬰ�G");
    for (String token:arr1) 
        arr.add(token);
    System.out.println(arr);
    System.out.print("�Ʀr�`�X���G");
    System.out.println(sum);
  }
}
