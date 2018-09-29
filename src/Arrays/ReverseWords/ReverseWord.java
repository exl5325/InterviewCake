package Arrays.ReverseWords;

public class ReverseWord {

    public void reverseWord(char[] arr){
        reverseChar(arr,0, arr.length-1);

        int start = 0;
        for(int i = 0; i <= arr.length; i++){
            if(arr[i] == ' ' || i == arr.length-1){
                reverseChar(arr, start, i-1);
                start = i+1;
            }
        }

    }

    public void reverseChar(char[] arr, int high, int low){
        while(low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[] { 'b','o','b',' ','f','o','o'};

        ReverseWord rw = new ReverseWord();
        rw.reverseWord(arr);
        System.out.println(arr);
    }
}
