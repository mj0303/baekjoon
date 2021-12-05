import java.io.*;
import java.util.*;

public class bj3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            String a = st.nextToken();
            String b = st.nextToken();
            if(!arr1.contains(a)) {
                arr1.add(a);
            } else {
                arr1.remove(a);
            }
            if(!arr2.contains(b)) {
                arr2.add(b);
            } else {
                arr2.remove(b);
            }
        }
        bw.write(arr1.get(0) + " " + arr2.get(0));
        bw.flush();
        bw.close();
    }
}
