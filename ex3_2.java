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
        System.out.println("���s���J�X��ǥ�:");
        n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            Scanner Name = new Scanner(System.in);
            Scanner Score = new Scanner(System.in);
            System.out.println("��J�ǥ� "+(i+1)+" �m�W:");
            name = Name.nextLine();
            System.out.println("��J�ǥ� "+(i+1)+" ���Z:");
            score = Score.nextInt();
            map.put(name,score);
        }
        System.out.println("��J���d�߾ǥͩm�W:");
        Scanner Name = new Scanner(System.in);
        name = Name.nextLine();
        if(map.get(name)==null)
            System.out.println("�d�L���ǥ�!");
        else
            System.out.println("�ǥͩm�W "+name+"\t"+"���Z "+ map.get(name));
    }
}
