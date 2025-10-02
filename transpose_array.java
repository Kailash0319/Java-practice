import java.util.Scanner;
public class transpose_array {
    
    public static void main(String a[]){
    
        Scanner reader = new Scanner(System.in);
        
       System.out.print("Enter rows: ");
        int rows = reader.nextInt();
        System.out.print("Enter cols: ");
        int cols = reader.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0 ; i<rows ; i++){
            System.out.println();
            for(int j=0 ; j<cols ;j++){
            System.out.print("Enter element at index [" + i + "][" + j + "]: ");
            arr[i][j] = reader.nextInt();
            }
        }
        System.out.print("before transpose: ");
        for(int i = 0 ; i<cols ; i++ ){
            System.out.println();
            for(int j = 0 ; j<rows ; j++){
                System.out.print(arr[i][j]+ " ");
            }
        }        
        System.out.println();

        int[][] transpose = new int[cols][rows];
        for (int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<cols ;j++){
            transpose[i][j] = arr[j][i];
            }
        }
        System.out.print("after transpose: ");
        for(int i = 0 ; i<cols ; i++ ){
            System.out.println();
            for(int j = 0 ; j<rows ; j++){
                System.out.print(transpose[i][j]+ " ");
            }
        }
    }
}
