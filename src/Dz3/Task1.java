package Dz3;

import java.util.ArrayList;

//На вход приходят два ArrayList<Integer> напишите метод,
// который проверяет два массива на равенство.
// Нужно реализовать алгоритм, не использовать метод equals.
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(2);
        a.add(3);

        b.add(3);
        b.add(2);

        System.out.println(myEquals(a,b));
    }

    public static boolean myEquals(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.hashCode() != b.hashCode()) {
            return false;
        }
        return true;
    }
}
