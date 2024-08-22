package Arrays;

public class SecondMaxValue {

    int findSecondMaxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        SecondMaxValue secMaxVal = new SecondMaxValue();
        int[] arr = {13,34,2,34,33,35};
        int result = secMaxVal.findSecondMaxValue(arr);
        System.out.println("Second Maximum Value in Array is : " + result);
        
    }
    
}
