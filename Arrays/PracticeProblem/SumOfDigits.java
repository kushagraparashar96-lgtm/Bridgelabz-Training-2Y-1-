package Arrays.PracticeProblem;

public class SumOfDigits {
    public static int Sum(int nums){
        int s=0;
        while(nums>0){
            int digit =nums%10;     //last digit is extracted.
            s=s+digit;             // extracted digit is added to sum.
            nums=nums/10;          // last digit is removed
        }
        return s;
    }

    public static void main(String[] args) {
        int n= 123456;
        System.out.println(Sum(n));

    }
}
