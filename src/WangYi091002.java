public class WangYi091002 {
    public static void run() {
        int pairsCount = getPairs(3, 8);
        System.out.println(pairsCount);
    }

    public static int getPairs(int m, int n) {
        int min = Math.min(m, n);
        int max = Math.max(m, n);
        int ssrCount = 0;
        for (int i = 1; i <= min; i++) {
            for (int j = i; j <= min; j++) {
                if (isSSR(i, j)) {
                    ssrCount += 1;
                }
            }
        }
        for (int i = 1; i <= min; i++) {
            for (int j = min + 1; j <= max; j++) {
                if (isSSR(i, j)) {
                    ssrCount += 1;
                }
            }
        }
        return ssrCount;
    }

    public static boolean isSSR(int i, int j) {
        int sumSquare = i * j;

        int m = 1;
        while (sumSquare > 0) {
            sumSquare -= m;
            m += 2;
        }
        return sumSquare == 0;
    }
}
