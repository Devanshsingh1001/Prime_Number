import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;

        for(int i=2;i<=n;i++){
            if(n % i == 0){
                d++;
            }
        }
        if(d == 1){
            System.out.println("is Prime");
        }
        else{
            System.out.println(" is not prime");
        }
    }
}
