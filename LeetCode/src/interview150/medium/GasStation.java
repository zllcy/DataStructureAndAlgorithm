package interview150.medium;

/**
 * 134. 加油站
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = -1;
        int len = gas.length;
        int[] newGas = new int[len * 2];
        int[] newCost = new int[len * 2];
        for (int i = 0; i < len * 2; i++) {
            newGas[i] = gas[i % len];
            newCost[i] = cost[i % len];
        }
        int i = 0;
        while (i < len) {
            int curGas = gas[i];
            int needCost = cost[i];
            if (curGas < needCost || curGas == 0) {
                i++;
                continue;
            }
            curGas -= needCost;
            boolean isReach = true;
            for (int j = i + 1; j < i + len; j++) {
                curGas += newGas[j];
                needCost = newCost[j];
                if (curGas < needCost) {
                    isReach = false;
                    i = j;
                    break;
                }
                curGas -= needCost;
            }
            if (isReach) {
                res = i;
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int res = new GasStation().canCompleteCircuit(gas, cost);
        System.out.println(res);
    }
}
