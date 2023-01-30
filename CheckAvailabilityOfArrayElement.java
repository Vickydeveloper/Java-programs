//Check the availability of array elements using user-define method

public class CheckAvailabilityOfArrayElement {
    private static boolean contains(String[] str,String element) {
        for(String s : str) {
            if(s.equals(element)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String []arr  = {"mca","Kgisl","college","coimbatore","java"};
        System.out.println(contains(arr,"java"));
        System.out.println(contains(arr,"python"));
    }
}
