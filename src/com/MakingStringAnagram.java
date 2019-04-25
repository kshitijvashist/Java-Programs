import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingStringAnagram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        List<String> aList=new ArrayList<>();
            Map<String,Integer> map1=new HashMap<>();
            Map<String,Integer> map2=new HashMap<>();
            
            for(int i=0;i<a.length();i++)
            {
                int count=0;
                for(int j=0;j<b.length();j++)
                {
                    if(a.charAt(i)==b.charAt(j))
                        count=count+1;
                }
                if(count==0)
                    aList.add(a.charAt(i)+"");
                else
                    map1.put(a.charAt(i)+"", count);
                
            }
            
            
            for(int i=0;i<b.length();i++)
            {
                int count=0;
                for(int j=0;j<a.length();j++)
                {
                    if(b.charAt(i)==a.charAt(j))
                        count=count+1;
                }
                if(count==0)
                    aList.add(b.charAt(i)+"");
                else
                    map2.put(b.charAt(i)+"", count);
            }
            
            for (Map.Entry<String,Integer> entry : map2.entrySet())  
            {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            
            for (Map.Entry<String,Integer> entry : map1.entrySet())  
            {    
                int val=0;
               String Key =entry.getKey();
               System.out.println(entry.getKey()+" "+entry.getValue());
               for (Map.Entry<String,Integer> entry1 : map2.entrySet())  
                {
                   String Key1 =entry1.getKey();
                   
                   if(Key.equals(Key1))
                   {
                       val=entry.getValue() - entry1.getValue();
                       break;
                   }
                   
                   
                }
                
               if(val!=0)
               {
                  
               for(int i=0;i<Math.abs(val);i++)
                   aList.add(Key);
               }
            }
        
                
            return aList.size();
            

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
