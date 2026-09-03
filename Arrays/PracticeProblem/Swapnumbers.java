package Arrays.PracticeProblem;

public class Swapnumbers {
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void Display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

                Display(arr);

                swap(arr,1,5);

    }
}
