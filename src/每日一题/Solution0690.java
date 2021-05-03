package 每日一题;

import java.util.HashMap;
import java.util.List;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-05-02
 */
public class Solution0690 {
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    HashMap<Integer, Employee> map;

    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return get(id);
    }

    private int get(int id) {
        Employee employee = map.get(id);
        int res = employee.importance;
        for (Integer i : employee.subordinates) {
            res += get(i);
        }
        return res;
    }
}
