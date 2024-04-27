import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int num : nums) {
            if(num % 2 > 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        List<Integer> nums = new ArrayList<>(List.of(8,1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        int save = 0;
        for (int num : nums) {
            if (num % 2 == 0 && save != num) {
                System.out.println(num);
                save = num;
            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> set = new HashSet<>(strings);
        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (!map.containsKey(string)) {
                map.put(string,1);
            } else {
                map.put(string,map.get(string)+1);
            }
        }
        String save = "";
        for (String string : strings) {
            if (map.containsKey(string) && !Objects.equals(save, string)) {
                System.out.println(map.get(string));
                save = string;
            }
        }

    }
}
