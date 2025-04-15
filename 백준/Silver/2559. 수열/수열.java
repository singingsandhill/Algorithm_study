import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] tokens = br.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]);
        int K = Integer.parseInt(tokens[1]);
        
        int[] temps = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            temps[i] = Integer.parseInt(st.nextToken());
        }

        int windowSum = 0;
        // 처음 K일 합 구하기
        for (int i = 0; i < K; i++) {
            windowSum += temps[i];
        }

        int maxSum = windowSum;

        // 슬라이딩 윈도우
        for (int i = K; i < N; i++) {
            windowSum = windowSum - temps[i - K] + temps[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);
    }
}