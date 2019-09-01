import java.io.*;
import java.util.*;

public class BubbleSort {

    public static void bubbleSort(List<Integer> ar1){
        for (int i = 0; i < ar1.size(); i++) {
            
            for (int j = 0; j < ar1.size()-i-1; j++) {
                if(ar1.get(j)>ar1.get(j+1))
                {
                    Collections.swap(ar1, j, j+1);
                }
            }
        }

    }
    public static void selectionSort(List<Integer> ar1){
        for (int i = 0; i < ar1.size(); i++) {
            Collections.swap(ar1,ar1.indexOf(Collections.min(ar1.subList(i, ar1.size()))), i);
        }

    }
    public static void insertionSort(List<Integer> ar1){
        for (int i = 1; i < ar1.size(); i++) {
            // int target= ar1.get(i);
            int targ_i=i;
            int j=i-1;
            // ar1.get(targ_i)
            while(j>-1&&ar1.get(targ_i)< ar1.get(j))
            {
                Collections.swap(ar1, targ_i, j);
                // target=ar1.get(j);
                targ_i=j;
                j--;
            }
        }
    }

    public static void mergeSort(List<Integer> ar1){
        for (int i = 0; i < ar1.size(); i++) {
            
            for (int j = 0; j < ar1.size()-i-1; j++) {
                if(ar1.get(j)>ar1.get(j+1))
                {
                    Collections.swap(ar1, j, j+1);
                }
            }
        }

    }

    public static void quickSort(List<Integer> ar1){
        for (int i = 0; i < ar1.size(); i++) {
            
            for (int j = 0; j < ar1.size()-i-1; j++) {
                if(ar1.get(j)>ar1.get(j+1))
                {
                    Collections.swap(ar1, j, j+1);
                }
            }
        }

    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //  Scanner s = new Scanner(System.in); 
        // int n = s.nextInt(); 
        // List<Integer> ar = new ArrayList<Integer>(n);
        List<Integer> ar = new ArrayList<>(Arrays.asList(3,5,2,1,4,5,9,8));

        

        for(int i=0;i<ar.size();i++)
        {
            System.out.print(ar.get(i)+" ");
        }

        System.out.println("\n");
        insertionSort(ar);

        for(int i=0;i<ar.size();i++)
        {
            System.out.print(ar.get(i)+" ");
        }


    }
}



// List<String> places = Arrays.asList("Buenos Aires", "Córdoba", "La Plata");
