package Arrays.PracticeProblem;

public class Reverse_Array {
    public static void Swap(int arr[]){
        int a=0,b=arr.length-1;
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
    public static void Display(int arr[]){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
    

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        Display(nums);
        Swap(nums);
        System.out.println("");
        Display(nums);
    }
}
