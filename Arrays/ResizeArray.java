package Arrays;

public class ResizeArray {

    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i=0; i< arr.length; i++){
            temp[i] = arr[i];

        }
        arr = temp;
        return arr;
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n; i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ResizeArray resizeArr = new ResizeArray();
        int[] arr = {5,6,3,10};
        resizeArr.printArray(resizeArr.resize(arr, 9));

        
    }
    
}
