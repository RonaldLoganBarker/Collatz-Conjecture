
public class Practice {
    
//    int[] instastops = new int[]{4, 2, 1};
    
    public static void main(String[] args) {
        int n = 3301;
        System.out.println(Collatz(n));
    }
    
    public static int Collatz(int n) {
        if (n == 4)
            return 2;
        
        int iterations = 0;
        
        while (n != 4) {
            if (n % 2 == 0)
                n /= 2;
            else
                n = (n * 3) + 1;
            iterations++;
            if (n == 2 || n == 1)
                return iterations;
        }
        
        return iterations;
    }
    
}
