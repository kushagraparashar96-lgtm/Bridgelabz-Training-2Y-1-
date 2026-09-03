package Arrays.PracticeProblem;

public class palindrome {

    public static boolean PalindromeCheck(int nums){
        if(nums==0 || nums<0){
            return false;
        }
        int reversenums=0;
        int orignalnums=nums;
        while(nums>0){

            int digit= nums%10;
            reversenums =reversenums*10 + digit;
            nums=nums/10;
        }

        return  nums== reversenums;
    }

    public static void main(String[] args) {

        System.out.println(PalindromeCheck(121));
        System.out.println( PalindromeCheck(13342));

    }
}
