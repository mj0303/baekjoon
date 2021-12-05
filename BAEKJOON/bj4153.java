import java.util.*;
import java.io.*;

public class bj4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean checker = true;
        while(checker) {
            ArrayList<Integer> arr = new ArrayList<>();
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int leng = st.countTokens();
            for(int i = 0; i < leng; i++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            if(arr.get(0) == 0) {
                checker = false;
                break;
            } else {
                Collections.sort(arr);
                if((int)Math.pow(arr.get(2), 2) == (int)Math.pow(arr.get(0), 2) + (int)Math.pow(arr.get(1), 2)) {
                    bw.write("right");
                } else {
                    bw.write("wrong");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
