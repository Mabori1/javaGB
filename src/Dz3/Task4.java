package Dz3;
import java.util.ArrayList;
import java.util.Iterator;

// На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)


public class Task4 {
    public static void main(String[] args) {

        int[] arr = {10, 4, 5, 6, 7, 2, 2, 9};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println(noEven(list));
    }

    public static ArrayList<Integer> noEven(ArrayList<Integer> alist) {

        Iterator<Integer> it = alist.iterator();
        while(it.hasNext()){
            Integer number= it.next();
            if(number % 2 ==0){
                it.remove();
            }
        }
        return alist;
    }
}
