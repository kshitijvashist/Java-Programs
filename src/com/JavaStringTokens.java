import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        List<String> list=new ArrayList<>();
        String tmp="";
        for(int i=0;i<s.length();i++){
            
            if((s.charAt(i)>=65 && s.charAt(i)<=90) ||(s.charAt(i)>=97 && s.charAt(i)<=122))
                tmp=tmp+s.charAt(i);
            else
            {
                if(!(tmp.isEmpty()))
                list.add(tmp);
                tmp="";
            }
                
        
        }
        if(!(tmp.isEmpty()))
            list.add(tmp);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        // Write your code here.
        scan.close();
    }
}

