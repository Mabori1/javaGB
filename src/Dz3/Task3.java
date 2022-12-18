package Dz3;
//На вход приходит ArrayList<Integer>. Отсортируйте в нем только четные числа.
// Пример: [10, 4, 5, 6, 7, 2, 2, 9] -> [2, 2, 5, 4, 7, 6, 10, 9]

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = {10, 4, 5, 6, 7, 2, 2, 9};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println(mySort(list));
    }

    public static ArrayList<Integer> mySort(ArrayList<Integer> alist) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i) % 2 != 0) {
                temp.add(i);
                temp.add(alist.get(i));
            }
        }

        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i) % 2 != 0) {
                alist.remove(i);
            }
        }

        alist.sort(Integer::compare);

        if (temp.size() > 0) {
            for (int i = temp.get(0), j = 0; j < temp.size(); ) {
                alist.add(i, temp.get(j + 1));
                if (j + 2 < temp.size()) {
                    i = temp.get(j + 2);
                }
                j += 2;
            }
        }

        return alist;
    }

}
