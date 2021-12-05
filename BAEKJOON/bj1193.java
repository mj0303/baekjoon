// 정수 숫자를 직사각형 안에 배열한다 생각했을 때 그것을 45도 기울여 피라미드 모양의 배열을 만들면
// 왼쪽의 모서리에서 떨어진 만큼이 denominator
// 오른쪽의 모서리에서 떨어진 만큼이 numerator의 값이 된다.
import java.io.*;

public class bj1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int denominator = 0;
        int numerator = 0;
        
        int a = 1;
        int apply = 0;
        boolean checker = true;

        while(true) {
            if(num >= a && num <= a+apply) {
                checker = false;
                break;
            } else {
                a +=  (apply + 1);
                apply += 1;
            }
        }

        if((apply%2) == 0) {
            numerator = a + apply - num + 1;
            denominator = num - a + 1;
        } else {
            numerator = num - a + 1;
            denominator = a + apply - num + 1;
        }

        bw.write(String.valueOf(numerator) + "/" + String.valueOf(denominator));
        bw.flush();
   }
}