package lab_lesson_3;

public class lab_3_2 {
    //finding min max of array
    public static void main(String[] args) {
        int[] arr = {1,1,10,11};
        int max = arr[0], min = arr[0];
        for (int i : arr) {
            if(i>=max) max = i;
            if(i<=min) min = i;
        }
        System.out.println("minimum: "+min);
        System.out.println("maximum: "+max);
    }
}
