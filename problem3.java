import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long largest = 1;
        System.out.println("reached here");
        for(long i = 2; n != 1; i++){
            /*if(i % 2 != 0){
            if(isPrime(i) && (n % i == 0))
                largest = i;
            }*/
            while(n % i == 0){
                n = n / i;
                largest = i;
            }
            //System.out.println("Largest is: " + largest);
        }
        System.out.println(largest);
    }
    /*public static boolean isPrime(long a){
        System.out.println("Checking for: "+ a);
        if(a % 2 == 0)
        return false;
        for(long i = 3; i <= a / 2; i++){
            if(a % i == 0)
                return false;
        }
        return true;
    }*/
}
