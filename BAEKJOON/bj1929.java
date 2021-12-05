import java.util.*;
import java.io.*;

public class bj1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int start = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());

        // p^2 >= n 안의 소수 배열 생성
        ArrayList<String> com = new ArrayList<>();
        for(int i = 2; i*i < last; i++) {
            int count = 0;
            for(int j = 1; j <=i; j++) {
                if(i%j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                com.add(String.valueOf(i));
            }
        }

        // 범위 내 자연수 배열 생성
        ArrayList<String> arr = new ArrayList<>();
        for(int i = start; i <= last; i++) {
            boolean checker = true;
            for(String j:com) {
                int num = Integer.parseInt(j);
                if(i%num == 0 && i/num != 1) {
                    checker = false;
                    break;
                }
            }
            if(checker && i != 1) {
                arr.add(String.valueOf(i));
            }
        }
        
        for(String i:arr) {
            bw.write(i);
            bw.newLine();
        }
        bw.flush();
    }
}
