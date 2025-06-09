import java.util.*;
public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int ans = 0;
        
        while(n > 0){
            int rem = n % 10;
            ans = ans + fact(rem);
            n = n /10;
        }
        if(original == ans){
            System.out.println(ans+" is strong number");
        }
        else{
            System.out.println(ans+" is not a strong number");
        }
    }
    public static int fact(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
}
