import java.io.*;
import java.util.*;

public class bj9020 {
    public static boolean isPrime(int num) {
        boolean checker = true;
        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                checker = false;
                break;
            }
        }
        return checker;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        for(int i = 0; i < test; i++) {
            int num = Integer.parseInt(br.readLine());

            if(isPrime(num/2)) {
                bw.write(String.valueOf(num/2) + " " + String.valueOf(num/2));
                bw.newLine();
            } else {
                // num이하의 소수 배열 생성
                Set<Integer> arr = new HashSet<>();
                for(int j = 2; j < num; j++) {
                    arr.add(j);
                }
                Set<Integer> primeNum = new HashSet<>();
                for(int j = 2; (int)Math.pow(j, 2) <= num; j++) {
                    if(isPrime(j)) primeNum.add(j);
                }
                Set<Integer> removeNum = new HashSet<>();
                for(int j:primeNum) {
                    for(int y = 2; y*j < num; y++) {
                        if(y%j == 0 && y != j) {
                            removeNum.add(y);
                        }
                    }
                }
                arr.removeAll(removeNum);
                System.out.println(arr);

                int r1 = 0;
                int r2 = 0;
                for(int j:arr) {
                    if((num - j) < j) {
                        break;
                    } else if(arr.contains(num - j)) {
                        r1 = j;
                        r2 = num - j;
                    }
                }
                bw.write(String.valueOf(r1) + " " + String.valueOf(r2));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}