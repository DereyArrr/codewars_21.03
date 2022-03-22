import java.util.ArrayList;
import java.util.List;

//В этом Ката ваша функция получает на вход массив целых чисел. Ваша задача — определить, расположены ли числа
// в порядке возрастания. Говорят, что массив находится в порядке возрастания, если нет двух соседних целых чисел,
// где левое целое число превышает по значению правое целое.
class Solution {

    public static boolean isAscOrder(int[] arr) {
boolean c = true;
//boolean cc = true;
        for(int i=0; i< arr.length-1; i++){
            if(c) {
                if (arr[i + 1] >= arr[i]) {
                    c = true;
                } else {
                    c = false;
                }
            }
        }
return c;

    }

}

//В этом ката вы создадите функцию, которая берет список неотрицательных
// целых чисел и строк и возвращает новый список с отфильтрованными строками.
class Kata {

    public static List<Object> filterList(final List<Object> list) {
        List list1 = new ArrayList();
        for(int i=0; i< list.size(); i++){
           if (list.get(i) instanceof Number){
               list1.add(list.get(i));
           }

        }
        return list1;
    }
}


public class main {
    public static void main(String[] args) {
        System.out.println(Solution.isAscOrder(new int[]{1,2,4,7,19}));
        System.out.println(Solution.isAscOrder(new int[]{1,6,10,18,2,4,20}));
        System.out.println(Solution.isAscOrder(new int[]{1,2,3,4,5}));
        System.out.println(Solution.isAscOrder(new int[]{9,8,7,6,5,4,3,2,1}));

        System.out.println(Kata.filterList(List.of(1, 2, "a", "b")));
        System.out.println(Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)));
    }
}
