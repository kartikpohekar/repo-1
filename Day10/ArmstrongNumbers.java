package Day10;
class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int n = i, sum = 0, temp = n, digits = String.valueOf(i).length();
            while (temp > 0) {
                int d = temp % 10;
                sum += Math.pow(d, digits);
                temp /= 10;
            }
            if (sum == n) System.out.println(n);
        }
    }
}
