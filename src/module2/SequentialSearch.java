package module2;

public class SequentialSearch {

    static int findElement(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {158,207,392,62,315,434,487,268,405,241};
        System.out.println(findElement(arr, 405));
    }
}
