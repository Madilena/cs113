


import java.util.*;
public class DyanamicCoin{

    public static int[] change(int amount) {
        int[] coins = {25, 10, 5, 1};
        int[] combinations = new int[amount + 1];
        combinations[0] =1;
        for(int coin : coins) {
            for(int i = 1; i< combinations.length; i++) {
                if(i >= coin) {
                    combinations[i] += combinations[i - coin];
                    //  printAmount(combinations);
                }
            }
        }
        return combinations;
    }
    public static void printAmount(int[] arr) {
        for(int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


