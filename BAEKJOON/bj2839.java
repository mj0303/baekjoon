import java.io.*;

public class bj2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean checker = false;

        if(n/5 == 0) {
            String s1 = (n == 3) ? "1" : "-1";
            bw.write(s1);
        } else {
            for(int i = n/5; i > 0; i--) {
                int temp = n-(5*i);
                if(temp%3 == 0) {
                    bw.write(String.valueOf(i + temp/3));
                    checker = true;
                    break;
                }
            }
            if(!checker) {
                if(n%3 == 0) {
                    bw.write(String.valueOf(n/3));
                    checker = true;
                } else {
                    bw.write("-1");
                }
            }
        }
        bw.flush();
    }
}
