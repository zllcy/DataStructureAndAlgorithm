package interview150.medium;

import java.util.*;

/**
 * 380. O(1) 时间插入、删除和获取随机元素
 */
public class InsertDeleteGetRandomO1 {
    class RandomizedSet {

        Set<Integer> set;

        public RandomizedSet() {
            set = new HashSet<>();
        }

        public boolean insert(int val) {
            if (set.contains(val)) {
                return false;
            }
            set.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!set.contains(val)) {
                return false;
            }
            set.remove(val);
            return true;
        }

        public int getRandom() {
            List<Integer> list = new ArrayList<>(set);
            Random random = new Random();
            return list.get(random.nextInt(list.size()));
        }
    }
}
