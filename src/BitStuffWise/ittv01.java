package BitStuffWise;

public class ittv01 {
    public static void main(String[] args) {
        int j = 55;
        numberOf1Bits(j);
    }
    public static void numberOf1Bits(int n) {
        int count = 0;
        int size = Integer.toBinaryString(n).length();
        for (int i = 0; i < size; i++) {
            if ((n & (1 << i)) > 0) count++; 
        }
        System.out.println("number of 1s in " + Integer.toBinaryString(n) + " is: " + count);
        return;
    }

    public static void printBinary(int n) {
        System.out.println(n + " in binary is: " + Integer.toBinaryString(n));
        return;
    }
    public static void flipAllBits(int t) {
        int n = Integer.toBinaryString(t).length();
        int x = 0;
        for (int i = 0; i < n; i++) {
            x |= x + 1;
        }
        System.out.println(t + " is flipped to " + Integer.toBinaryString(x - t) + " which is " + (x - t));
        return;
    }

}
