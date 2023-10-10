import java.util.*;

public class Solution{
    //declares variable 'num'
    int num;

    //isPrime method with for loop and if statement for calculations 
    static boolean isPrime(int num){
        for(int i=2; i<num; i++){
        if(num%i == 0){
            return false;
        }
    }
    return true;
}
public static void main(String[] args){
        System.out.println("Is Prime: ");
        System.out.println(isPrime(9));
        System.out.println(isPrime(3));
    }
}