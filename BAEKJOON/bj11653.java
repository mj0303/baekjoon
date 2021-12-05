import java.io.*;

public class bj11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int temp = num;

        for(int i = 2; i < temp+1; i++) {
            if(temp%i == 0) {
                int count = 0;
                boolean check = true;
                while(check) {
                    if(temp%i == 0) {
                        temp = temp/i;
                        count++;
                    } else {
                        check = false;
                    }
                }
                for(int j = 0; j < count; j++) {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                }
            }
            if(temp == 1) {
                break;
            }
        }
        bw.flush();
    }
}
