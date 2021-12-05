import java.io.*;

public class bj3053 {
    static double euclidCalculator(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    static double nonEuclidCalculator(double radius) {
        return Math.pow(radius, 2) * 2;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radius = Integer.parseInt(br.readLine());

        double euclid = euclidCalculator(radius);
        double nonEuclid = nonEuclidCalculator(radius);

        System.out.format("%.6f", euclid);
        System.out.format("\n%.6f", nonEuclid);
    }
}
