//Find the minimum and maximun number of an array using user-define method

public class FindMinMaxOfArray {
    private static int min(int[] arr) {
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i]; 
            }    
        }
        return min;        
    }   
    private static int max(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i]; 
            }    
        }
        return max;
    } 
    public static void main(String[] args) {

        int []arr = {22,33,77,45,22,88,90};
        System.out.println("Minimum value of an array is : " + min(arr));
        System.out.println("Minimum value of an array is : " + max(arr));
    }
}
