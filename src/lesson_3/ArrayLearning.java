package lesson_3;

public class ArrayLearning {
    public static void main(String[] args) {
        final int length = 5;
        int[] arr = new int[length];
        //String[] str = new String[length];

        for(int i=0;i<length;i++){
            arr[i] = ++i;
            //arr[i] = i;
        }
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
            //arr[i] = i;
        }
        
    }
}
