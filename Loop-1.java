import java.io.*;
public class Solution {
 public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
         scanner.close();
         for(int i = 1; i <= 10; i++)
        {
           System.out.printf("%d x %d = %d%n", N, i, N*i);
         }
    }
}
