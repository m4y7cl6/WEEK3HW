package extoken;
import java.util.*;
public class EXtoken 
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map;
        map = new HashMap<String,Integer>();
        String name;
        int score;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("欲連續輸入幾位學生:");
        n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            Scanner Name = new Scanner(System.in);
            Scanner Score = new Scanner(System.in);
            System.out.println("輸入學生 "+(i+1)+" 姓名:");
            name = Name.nextLine();
            System.out.println("輸入學生 "+(i+1)+" 成績:");
            score = Score.nextInt();
            map.put(name,score);
        }
        System.out.println("輸入欲查詢學生姓名:");
        Scanner Name = new Scanner(System.in);
        name = Name.nextLine();
        if(map.get(name)==null)
            System.out.println("查無此學生!");
        else
            System.out.println("學生姓名 "+name+"\t"+"成績 "+ map.get(name));
    }
}
