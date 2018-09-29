package Arrays.ReverseString;

/**
 * Reverse a string in place
 */
public class ReverseString {

    public void reverse(char[] arr){
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[] { 'a', 'b', 'c', 'd', 'e' };

        ReverseString rs = new ReverseString();
        rs.reverse(arr);

        for(Character c:arr){
            System.out.println(c);
        }
    }
}
