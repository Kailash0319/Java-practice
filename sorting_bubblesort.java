import java.util.Scanner;
public class sorting_bubblesort {

    public static void main(String a[]){     
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = reader.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the elements of array: ");
        for(int i =0 ; i < n ; i++ ){
            arr[i] = reader.nextInt();
        }
        for(int i=0 ; i < n-1 ; i++){
            for(int j=0 ; j<n-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("the sorted array is: ");
        for(int i= 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        reader.close();   
    }  
}
