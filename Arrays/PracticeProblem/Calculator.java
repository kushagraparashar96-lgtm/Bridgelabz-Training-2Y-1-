package Arrays.PracticeProblem;

public class Calculator {
    public static int Add(int a, int b){
        return a+b;
    }
    public static int Sub(int a, int b){
        return a-b;
    }
    public static int Mul(int a, int b){
        return a*b;
    }
    public static int Div(int a, int b){
        if(b==0){
            System.out.println("error");
            return 0;
        }
        return a/b;
    }


    public static void main(String[] args) {


        System.out.println(Add(10,20));
        System.out.println(Sub(10,4));

    }
}
