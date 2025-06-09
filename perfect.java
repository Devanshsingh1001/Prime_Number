import java.util.*;
public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for(int i=1;i<n;i++){
            if(n % i == 0){
                ans = ans + i;
            }
        }
        if(n == ans){
            System.out.println("is Perfect number");
        }
        else{
            System.out.println("is not perfect number");
        }
    }
}
