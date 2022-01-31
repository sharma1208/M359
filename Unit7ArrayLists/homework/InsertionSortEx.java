package Unit7ArrayLists.homework;

import java.util.ArrayList;

public class InsertionSortEx {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(3);
        num.add(4);
        num.add(1);
        num.add(6);
        num.add(4);

        insertionSort(num);
        System.out.println(num);
    }

    public static void insertionSort(ArrayList<Integer> list){
        for(int i = 1; i < list.size(); i++){
            int valueToInsert = list.get(i); //get the value to insert
            int position = i; //store the position to insert value in
            while(position > 0 && list.get(position-1) > valueToInsert){
                list.set(position,list.get(position-1)); //we shift the value next to the value to insert to the right
                position--;
            }
            list.set(position,valueToInsert);
        }

    }
}
