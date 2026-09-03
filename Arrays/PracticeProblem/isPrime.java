package Arrays.PracticeProblem;

public class isPrime {
    public static boolean Primech(int n){
        if(n<=1){
            return  false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int testno[]= { 1,24,17,23,77};
        for(int num:testno){
            if(Primech(num)){
                System.out.println(num);
            }
        }
    }
}
