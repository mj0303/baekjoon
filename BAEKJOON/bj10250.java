import java.io.*;
import java.util.*;

public class bj10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());

        for(int i = 0; i < test; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int height = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            String yy = new String();
            String xx = new String();

            yy = (n % height == 0) ? Integer.toString(height) : Integer.toString(n % height);
            bw.write(yy);
            xx = (n % height == 0) ? Integer.toString(n / height) : Integer.toString(n / height + 1);
            if(Integer.valueOf(xx) < 10) bw.write("0");
            bw.write(xx);
            bw.newLine();
        }
        bw.flush();
    }
}
