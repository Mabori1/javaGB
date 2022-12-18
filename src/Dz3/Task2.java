package Dz3;

//На вход методу приходят два ArrayList<Integer> и целое число num.
// Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(2);
        a.add(3);

        b.add(3);
        b.add(2);

        System.out.println(myEquals(a, b, 3));
    }

    public static boolean myEquals(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int num) {
        Integer num1 = 0, num2 = 0;
        for(Integer item : arr1) {
            if(item == num) {
                num1++;
            }
        }
        for(Integer item : arr2) {
            if(item == num) {
                num2++;
            }
        }
        return num1 == num2 && (num1 != 0 || num2 != 0);
    }
}
