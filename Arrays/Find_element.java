package JAVA.Arrays;

/**
 * Find_element
 * 
 * https://www.youtube.com/watch?v=3AcyounXhfg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=96
 */
public class Find_element {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int target = 40;

        int index = -1;

        for(int i=0 ; i < arr.length ; i++){
            if( arr[i] == target){
                index = i;
                break;
            }

        }

        System.out.println(index);
    }
}