import java.io.*;
import java.util.*;

public class bj1011 {
    public static int move = 0;
    public static int distance = 0;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int test = Integer.parseInt(br.readLine());

        for(int i=0; i < test; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            distance = b-a;

            // main
            for(int j = 1; j <= distance; j++) {
                if((int)Math.pow((j+1), 2) == distance) {
                    bw.write(String.valueOf(2*j + 1));
                    break;
                } else if((int)Math.pow((j+1), 2) > distance) {
                    move = j*2 -1;
                    int last = distance - (j*j);
                    for(int x = j; x >= 0; j--) {
                        if(last%j == 0) {
                            move += last/j;
                            bw.write(String.valueOf(move));
                            break;
                        } else {
                            move += last/j;
                            last = last%j;
                        }
                    }
                    break;
                }
            }
            // main

            bw.newLine();
            move = 0;
        }
        bw.flush();
    }
}
