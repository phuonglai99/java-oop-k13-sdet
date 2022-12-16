package lab_lesson_3;

public class lab_3_4 {
    //merge two ordered arrays//
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,7,8};
        int []b = {1,2,3,7,8};
        int []c = new int[a.length+b.length];
        int indexa = 0, indexb = 0, indexc = 0;
        while(indexc<c.length){
            if(indexa == a.length) {
                c[indexc] = b[indexb++];
                //indexb++;
            }
            else if(indexb == b.length) {
                c[indexc] = a[indexa++];
                //indexa++;
            }
            else if(a[indexa]>b[indexb]){
                c[indexc] = b[indexb++];
                //indexb++;
            }
            else {
                c[indexc] = a[indexa++];
                //indexa++;
            }
            indexc++;
        }
        for (int i : c) {
            System.out.println(i);
        }
    }
}
