package util;

import java.util.Collection;

public class CustomArrayList<DesiredType> {

    private int size = 20;
    public DesiredType[] data = (DesiredType[]) new Object[size];
    private int i = 0;

    public int size() {
        return i;
    }

    public boolean isEmpty() {
        if (i == 0) {
            return true;
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i <= this.i; i++) {
            data[i] = null;
        }
        this.i = 0;
    }

    public Object[] toArray() {
        Object[] newArray = new Object[this.i];
        for (int i = 0; i < this.i; i++) {
            newArray[i] = data[i];
        }
        return newArray;
    }

    public boolean contains(Object toFind) {
        for (int i = 0; i < this.i; i++) {
            if (data[i].equals(toFind)) {
                return true;
            }
        }
        return false;
    }

    public void add(DesiredType item) {
        data[i] = item;
        i++;
    }

    public DesiredType get(int index) {
        return data[index];
    }

    public DesiredType remove(Object item) {
        for (int i = 0; i < this.i; i++) {
            if (data[i] == null){
            }
            else if (data[i].equals(item)) {
                for (int j = i; j <= this.i; j++) {
                    data[j] = data[j + 1];
                }
            }


        }
        data[this.i] = null;
        i--;
        return null;
    }

    public boolean containsAll(Collection<? extends DesiredType> items) {
        for (int i = 0; i < this.i; i++) {
            for (int j = 0; j < items.size(); j++){
                if (data[i].equals(items.iterator())){
                    System.out.println(items);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addAll(Collection<? extends DesiredType> items) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends DesiredType> items) {
        for (int i = this.i; i < items.size(); i++)
            data[i] = items.iterator()
        return false;
    }

    public boolean removeAll(Collection<? extends DesiredType> items) {
        return false;
    }

    public DesiredType set(int index, DesiredType item) {
        return null;
    }

    public DesiredType remove(int index) {
        //remove item at specified index, move the items ahead back one to fill the arraylist.
        for (int i = index; i <= this.i; i++) {
            data[i] = data[i + 1];
        }
        data[this.i] = null;
        i--;
        return null;
    }

    public int indexOf(Object item) {
        for (int i = 0; i < this.i; i++) {
            if (data[i].equals(item)) {
                return i;
            }
        }
        return 999999;
    }

    public int lastIndexOf(Object item) {
        return 0;
    }
}
