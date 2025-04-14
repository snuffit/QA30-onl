package homework.homework_11.custom_array_list;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList{
    private T[] array;
    private int size;

    public CustomArrayList(){
        this.array = (T[])  new Object[100];
        this.size = 0;
    }

    public CustomArrayList(int size){
        this.array = (T[]) new Object[size];
        this.size = 0;
    }

    @Override
    public void add(Object... elements) {
        for(Object el : elements) {
            this.array[size] = (T) el;
            this.size++;
            giveMoreSpace(isEnoughSpace());
        }
    }

    @Override
    public void del(int index) {
        T[] newArray = (T[]) new Object[this.array.length];

            if (index < 0 || index >= this.size) {
                System.out.println("Index NOT found!!");
                return;
            }
            for (int i = 0, d = 0; i < this.size; i++) {
                if (i == index) {
                    continue;
                } else {
                    newArray[d] = this.array[i];
                    d++;
                }
            }

        this.size--;
        this.array = newArray;
    }

    @Override
    public Object get(int index) {
        return (T) this.array[index];
    }

    @Override
    public boolean contains(Object element) {
        if(Arrays.asList(this.array).contains((T) element)){
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.array = (T[])  new Object[100];
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public StringBuilder print() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < this.size; i++){
            str.append(this.array[i] + " ");
        }
        return str;
    }

    private boolean isEnoughSpace(){
        if(this.array.length / this.size <= 2){
            return false;
        }else {
            return true;
        }
    }
    private void giveMoreSpace(boolean isEnoughSpace){
        if(!isEnoughSpace){
            T[] newArray = (T[]) new Object[this.array.length + this.size];
            copyOldArrayToNew(newArray);
            this.array = newArray;
        }
    }
    private void copyOldArrayToNew(T[] newArray){
        for(int i = 0; i < this.size; i++){
            newArray[i] = this.array[i];
        }
    }
}
