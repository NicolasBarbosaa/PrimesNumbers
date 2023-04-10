import java.util.ArrayList;
    public class PrimeDirective{
        public boolean isPrime(int givedNumber){
            int number = givedNumber;
            int divisores = 0;
             for( int i = 1; i<= number; i++){
                if(number % i ==0){
                    divisores++;
                }
            }
            if(divisores ==2){
                return true;
            }else{
                return false;
            }
        }
        public ArrayList <Integer> onlyPrimes(int [] numbers){
            ArrayList<Integer> primes = new ArrayList<Integer>();
            for(int number : numbers){
                if(isPrime(number)){
                    primes.add(number);
                }
            } 
            return primes;
        }

        public static void main(String[] args){
            PrimeDirective prime = new PrimeDirective();
            int [] numbers = {1,2,3,4,5,6,7,8,9,10};
            boolean teste = prime.isPrime(13);
            ArrayList<Integer> novosNumeros = prime.onlyPrimes(numbers);
            System.out.println(novosNumeros);
            
    }
}