package Arrays;

public class ArrayUtil {

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n; i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }

   

    public int getMinimumValue(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for(int num : arr){
            sum = sum-num;
        }
        return sum;
    }

    public int[] moveZeros(int arr[]){
        int j = 0;
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
        return arr;
    }

    public int[] removeEven(int[] arr){
        int oddCount = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] oddresult = new int[oddCount];
        int idx = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] % 2 != 0){
                oddresult[idx] = arr[i];
                idx++;
            }
        }
        return oddresult;
    }


    public void arrayDemo(){
        int[] arr = {2,4,1,0,8,0,6,3,7};
        //System.out.println("Missing Number in array is :" + findMissingNumber(arr));
       // System.out.println("Minimum Number in array is :" + getMinimumValue(arr));
        printArray(moveZeros(arr));
        printArray(removeEven(arr));

    }

    public static void main(String[] args){
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
    }
    
}
