package extoken;
import java.util.*;
import java.io.*;

public class EXtoken 
{
    public static void main(String[] args)throws IOException
    {
        ArrayList<String> arr = new ArrayList<String>();
        HashMap<String, Integer> map;
        map = new HashMap<String,Integer>();
        FileReader fr = new FileReader("c:\\Users\\user\\Desktop\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) 
        {
            String Line = br.readLine();
            Line = Line.toLowerCase();
            int n = Integer.valueOf(br.readLine());
            map.put(Line, n);
        }   
        fr.close();
        for(String temp:map.keySet())
            System.out.println(temp + "\t" + map.get(temp));    
        int op;
        while(true)
        {
            System.out.print("1)輸入新字串 2)輸入欲查詢字符 -1)結束：");
            Scanner OP = new Scanner(System.in);
            op = OP.nextInt();
            if(op==1)
            {
               
                System.out.println("輸入新字串：");
                Scanner NewS = new Scanner(System.in);
                String news = NewS.nextLine();
                news = news.toLowerCase();
                String [] tokens =news.split("[:|!|\\.|,|\\?\\s]+");
                for (String token:tokens) 
                {    
                    int s = 0;
                    try
                    {
                        int A = Integer.parseInt(token);
                        if(map.get(token)==null)
                        {
                            s=1;
                            map.put(token ,s);
                        }
                        else
                        {
                             s = map.get(token);
                             s++;
                             map.put(token ,s);
                        }
                    }
                    catch(NumberFormatException e)
                    {}
                    if(token.matches("[a-zA|\\.]*") )
                    {
                        if(map.get(token)==null)
                        {
                            s=1;
                            map.put(token ,s);
                        }
                        else
                        {
                             s = map.get(token);
                             s++;
                             map.put(token ,s);
                        }
                    }   
                    
                }
                for(String temp:map.keySet())
                    System.out.println(temp + "\t" + map.get(temp));   
            }   
            else if(op==2)
            {
                System.out.println("輸入欲查詢字串：");
                Scanner NewS = new Scanner(System.in);
                String news = NewS.nextLine();
                news = news.toLowerCase();
                if(map.get(news)==null)
                    System.out.println("查無此字串!");
                else
                    System.out.println(news+"\t"+"出現次數 "+ map.get(news));
            }
            else if(op==-1)
            {
               FileWriter fw = new FileWriter("c:\\Users\\user\\Desktop\\test.txt");  
               for (Object key : map.keySet()) 
                   fw.write(key + "\n" + map.get(key) + "\r\n");
               fw.flush();
               fw.close();
               break;
            }
            else
            {
                System.out.println("ERROR!");
                continue;
            }
        }
    }
}
