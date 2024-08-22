package Arrays;

public class ReverseArray {

    public int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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
        ReverseArray reverse = new ReverseArray();
        int[] arr = {2,3,5,6,7};
        int[] resultArray = reverse.reverseArray(arr);
        reverse.printArray(resultArray);
    }
    
}
