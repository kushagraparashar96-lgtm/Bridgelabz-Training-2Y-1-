package Arrays.PracticeProblem;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {


    java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
    list.add(0,3);
    list.add(1,6);
    list.add(2,9);
    list.add(3,12);
    list.add(3,100);

        System.out.println("This is our list"+list);
       // Arraylist to array conversion
          int num[]=new int[5];

          for(int i=0;i<num.length;i++){
              num[i]=list.get(i);
          }
        System.out.println("We have converted the arraylist into  array  :");
        System.out.println(Arrays.toString(num));
    }

}
