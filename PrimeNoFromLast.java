import java.util.*;


public class PrimeNoFromLast {
	
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
String line = sc.nextLine();
String[] tokens = line.split(" ");
boolean a=false;
int[] numbers = new int[tokens.length];
for (int i=0; i<numbers.length;i++){
    numbers[i] = Integer.parseInt(tokens[i]);
}
for (int i=tokens.length-1;i>=0;i--){
	if(isPrime(numbers[i]) && a==false){
   System.out.print(numbers[i]);
a=true;
}
}


    }
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n+1); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }
}