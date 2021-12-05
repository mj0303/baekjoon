import java.io.*;
import java.util.*;

public class bj1002 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int test = Integer.parseInt(br.readLine());

      for(int i = 0; i < test; i++) {
         String s = br.readLine();
         StringTokenizer st = new StringTokenizer(s);
         int x1 = Integer.parseInt(st.nextToken());
         int y1 = Integer.parseInt(st.nextToken());
         int r1 = Integer.parseInt(st.nextToken());
         int x2 = Integer.parseInt(st.nextToken());
         int y2 = Integer.parseInt(st.nextToken());
         int r2 = Integer.parseInt(st.nextToken());

         int x_distance = (int)Math.abs(x1 - x2);
         int y_distance = (int)Math.abs(y1 - y2);
         int distance = (int)Math.pow(x_distance, 2) + (int)Math.pow(y_distance, 2); // distance == R^2
         int r = (int)Math.pow(r1 + r2, 2); // r == (r1+r2)^2
         int com = (int)Math.pow(r2-r1, 2); // com == (r2-r1)^2

         if(x1==x2 && y1==y2) {
               if(r1 == r2) {
                  bw.write("-1");
               } else {
                  bw.write("0");
               }
         } else if(r == distance || com == distance) {
            bw.write("1");
         } else if(r < distance || com > distance){
            bw.write("0");
         } else {
            bw.write("2");
         }
         bw.newLine();
      }
      bw.flush();
      bw.close();
   }
}
