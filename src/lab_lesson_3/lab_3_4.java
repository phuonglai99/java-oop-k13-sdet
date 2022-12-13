package lab_lesson_3;

public class lab_3_4 {
    //merge two ordered arrays//
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        //boolean[] flag1 = new boolean[arr1.length];
        int[] arr2 = {4,5,6,8,9};
        //boolean[] flag2 = new boolean[arr2.length];
        int[] mergeArray = new int[arr1.length + arr2.length];
        int indexArr1 = 0, indexArr2 = 0, indexMergeArray = 0;

        while (indexArr1 < arr1.length && indexArr2 < arr2.length) {
            if (arr1[indexArr1] <= arr2[indexArr2]) {
                mergeArray[indexMergeArray] = arr1[indexArr1];
                //flag1[indexArr1] = true;
                indexArr1++;
            } else {
                mergeArray[indexMergeArray] = arr2[indexArr2];
                //flag2[indexArr2] = true;
                indexArr2++;
            }
            indexMergeArray++;
        }
        //if (flag2[arr2.length - 1] != true)
        if (indexArr2<arr2.length)
        {
            for (int i = indexArr2; i < arr2.length; i++) {
                mergeArray[indexMergeArray] = arr2[i];
                indexMergeArray++;
            }
        }
        if(indexArr1<arr1.length){
            for (int i = indexArr1; i < arr1.length; i++) {
                mergeArray[indexMergeArray] = arr1[i];
                indexMergeArray++;
            }
        }

        for (int i : mergeArray) {
            System.out.println(i);
        }
    }
}
