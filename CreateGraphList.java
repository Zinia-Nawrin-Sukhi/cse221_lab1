import java.io.*;
import java.util.*;
public class CreateGraphList{
    public static void main(String[] args) {
        BufferedReader obj= null;
        try {
            String str;
            FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\input.txt");
            obj = new BufferedReader(fr);
            str = obj.readLine();
            int v = Integer.parseInt(str);
            LinkedList<Integer> al[] = new LinkedList[v];
            for (int i= 0;i<al.length;i++){
                al[i] = new LinkedList<>();
            }
             while ((str = obj.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(str," ");
                int token1 = Integer.parseInt(st.nextToken());
                int token2 = Integer.parseInt(st.nextToken());
                al[token1].add(token2);
             }
             for(int i=0; i<al.length; i++)
             {
             System.out.print(i+ "-->"+ al[i]);
             System.out.println();
             }
            
            
        } catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
 }
