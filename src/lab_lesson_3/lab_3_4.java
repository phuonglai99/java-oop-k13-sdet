package lab_lesson_3;

public class lab_3_4 {
    //merge two ordered arrays//
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        boolean[] flag1 = new boolean[arr1.length];
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean[] flag2 = new boolean[arr2.length];
        int[] arr3 = new int[arr1.length + arr2.length];
        int indexArr1 = 0, indexArr2 = 0, indexArr3 = 0;

        while (indexArr1 < arr1.length && indexArr2 < arr2.length) {
            if (arr1[indexArr1] <= arr2[indexArr2]) {
                arr3[indexArr3] = arr1[indexArr1];
                flag1[indexArr1] = true;
                indexArr1++;
            } else {
                arr3[indexArr3] = arr2[indexArr2];
                flag2[indexArr2] = true;
                indexArr2++;
            }
            indexArr3++;
        }
        if (flag2[arr2.length - 1] != true) {
            for (int i = indexArr2; i < arr2.length; i++) {
                arr3[indexArr3] = arr2[i];
                indexArr3++;
            }
        } else {
            for (int i = indexArr1; i < arr1.length; i++) {
                arr3[indexArr3] = arr1[i];
                indexArr3++;
            }
        }

        for (int i : arr3) {
            System.out.println(i);
        }
    }
}
