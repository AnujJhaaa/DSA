import java.util.Arrays;

class test {
    public static void main(String[] args){
        int[] arr= { 1, 3 ,4 ,5 , 7};
        /* 
        String s1 =Arrays.toString(arr);
        Arrays.sort(arr);
        String s2 = Arrays.toString(arr);
        */

        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);

        if(Arrays.equals(arr, copy)){
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not Sorted");
        }

        int[] a =  new int[5];
        Arrays.fill(a,100);
        a[4]= 45;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        /*
        if(s1.equals(s2)){ 
            System.out.println("SORTED");
        }
        else {
            System.out.println("NOT SORTED");
        }
        */
    }
}