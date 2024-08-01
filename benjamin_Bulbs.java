/**
 * https://www.youtube.com/watch?v=7IbWTFOUP1U&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=34
 * 
 * benjamin_Bulbs
 * 
 * toggle 1st fluctuation all bulbs
 * 2nd fluctuation every 2nd bulb
 * 100th fluctuation every 100th bulb
 * 
 * so, we have to find out pure squre number
 */
public class benjamin_Bulbs {

    public static void main(String[] args) {
        
        int n = 100;

        for(int i=1; i*i <=n ; i++){
            System.out.println(i*i);
        }
    }
}