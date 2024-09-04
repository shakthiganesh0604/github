import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = scanner.nextInt();
        }
        int maxProfit = maxProfit(prices, N);
        System.out.println(maxProfit);
        scanner.close();
    }
    private static int maxProfit(int[] prices, int N) {
        int maxProfit = 0;
        for (int i = 1; i < N; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
