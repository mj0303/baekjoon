import java.io.*;
import java.util.*;

public class bj1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            arr.add(st.nextToken());
        }

        int result = 0;
        for(String i:arr) {
            int count = 0;
            if(Integer.parseInt(i) == 1) {
                continue;
            } else {
                for(int j = 1; j <= 1000; j++) {
                    if(Integer.parseInt(i)%j == 0) {
                        count++;
                    }
                    if(count > 2) {
                        break;
                    }
                }
                if(count == 2) result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
