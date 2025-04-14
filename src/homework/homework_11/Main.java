package homework.homework_11;

import homework.homework_11.custom_array_list.CustomArrayList;

import static homework.homework_3.HmOperators.row;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Number> arrayOfNums = new CustomArrayList<>(4);
        arrayOfNums.add(1, 2.2, -3, 4l, 55, 100);
        System.out.println(arrayOfNums.print());
        row();

        if(arrayOfNums.contains(55)){
            System.out.println("В этом массиве есть 55");
        }
        row();

        arrayOfNums.del(0);
        System.out.println(arrayOfNums.print());
        row();

        System.out.println("Сейчас размер массива - " + arrayOfNums.size());
        row();

        arrayOfNums.clear();
        System.out.println("А сейчас - " + arrayOfNums.size());

    }

}
