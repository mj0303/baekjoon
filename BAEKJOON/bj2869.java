import java.io.*;
import java.util.*;

public class bj2869 {
    public static void main(String[] atgs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        double temp1 = C-A;
        double temp2 = Math.ceil(temp1/(A-B));
        Double result = temp2;

        bw.write(String.valueOf(result.intValue() + 1));
        bw.flush();
    }
}