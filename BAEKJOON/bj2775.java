import java.io.*;
import java.util.*;

public class bj2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.valueOf(br.readLine());

        for(int i = 0; i < test; i++) {
            int height = Integer.parseInt(br.readLine());
            int width = Integer.parseInt(br.readLine());

            ArrayList<String> ls1 = new ArrayList<>();
            ArrayList<String> ls2 = new ArrayList<>();
            for(int j = 1; j <= width; j++) {
                ls1.add(String.valueOf(j));
                ls2.add(String.valueOf(j));
            }

            for(int j = 0; j < height; j++) {
                for(int x = 1; x <= width; x++) {
                    int temp = 0;
                    for(int y = 0; y < x; y++) {
                        temp += Integer.parseInt(ls1.get(y));
                    }
                    ls2.set(x-1, String.valueOf(temp));
                }
                for(int x = 0; x < width; x++) {
                    ls1.set(x, String.valueOf(ls2.get(x)));
                }
            }

            bw.write(String.valueOf(ls2.get(width-1)));
            bw.newLine();
        }
        bw.flush();
    }
}
