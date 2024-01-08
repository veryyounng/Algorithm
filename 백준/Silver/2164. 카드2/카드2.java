import java.util.*;
public class Main{
     public static void main(String []args){
         
        Queue <Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
         
        while(q.size() != 1){
            q.remove();
            q.add(q.poll());
        }
         
        System.out.print(q.peek());
     }
}