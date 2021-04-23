import java.io.*;
import java.util.*;
public class CreateGraph {
  
  public static void main(String[] args) {
//    int [][] graph = new int[6][6] ;
    BufferedReader obj= null;
    try {
      String str;
      FileReader fr = new FileReader("E:\\cse221\\lab\\lab1\\input.txt");
      obj = new BufferedReader(fr);
      str = obj.readLine();
      // convert this to int
      int v = Integer.parseInt(str);
      System.out.println(v);
      
      // creat the matrix 
     
      int graph[][]= new int[v][v];
      while ((str = obj.readLine()) != null) {
        // tokenize = a,b
        StringTokenizer st = new StringTokenizer(str," ");
        int token1 = Integer.parseInt(st.nextToken());
        
        int token2 = Integer.parseInt(st.nextToken());
        
        //connect graph [a][b] = 1 graph[b][a] = 1
       graph[token1][token2]=1;
      } for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
         System.out.print(graph[i][j]); 
        }
       System.out.println();  
      }
      
      LinkedList [] al = new LinkedList[v];
      for (int i= 0;i<al.length;i++){
        al[i] = new LinkedList<String>();
      }
      
    } catch (IOException e) {
      
      e.printStackTrace();
      
    }
  }
}
//     for (int i= 0;i<graph.length;i++){
//    for(int j = 0;j < graph[0].length;j++){
//      // print
//    }
//  }

  
  