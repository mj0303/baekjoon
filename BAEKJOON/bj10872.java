import java.io.*;

public class bj10872 {
    static int pactorial(int n, int sum) {
        if(!(n==1)) {
            pactorial(--n, sum*n);
            return 0;
        } else {
            return sum;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(pactorial(n, n)));
        bw.flush();
        bw.close();
    }
}
