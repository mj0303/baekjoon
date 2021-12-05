import java.io.*;
import java.util.*;

public class bj2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for(int i = m; i <= n; i++) {
            arr.add(String.valueOf(i));
        }
        if(arr.contains("1")) arr.remove("1");

        for(String i:arr) {
            int count = 0;
            for(int j = 1; j <= n; j++) {
                if(Integer.parseInt(i)%j == 0) {
                    count++;
                }
                if(count > 2) {
                    break;
                }
            }
            if(count == 2) {
                result.add(i);
            }
        }

        if(result.size() == 0) {
            bw.write("-1");
        } else {
            int sum = 0;
            for(String i:result) {
                sum += Integer.parseInt(i);
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(result.get(0));
        }
        bw.flush();
    }
}
