import java.io.*;
import java.util.*;

public class bj4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int start = Integer.parseInt(br.readLine());
            int last = start*2;

            if(start == 0) {
                break;
            } else {
                ArrayList<String> com = new ArrayList<>();
                for(int i = 2; i*i <= last; i++) {
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
                for(int i = start+1; i <= last; i++) {
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
                bw.write(String.valueOf(arr.size()));
                bw.newLine();
                bw.flush();
            }
        }
    }
}
