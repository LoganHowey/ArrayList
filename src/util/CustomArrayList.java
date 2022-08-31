package util;

import java.util.Collection;
import java.util.Iterator;

public class CustomArrayList<DesiredType> {

    private int size = 6;
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
            if (data[i] == null) {
            } else if (data[i].equals(item)) {
                for (int j = i; j <= this.i; j++) {
                    data[j] = data[j + 1];
                }
            }
        }
        data[this.i] = null;
        i--;
        return null;
    }

    public boolean containsAll(Collection<? extends DesiredType> items, int itemsAdded) {
        int numberofitems = 0;
        System.out.println(itemsAdded);
        int index = 0;
        Iterator<String> iterator = (Iterator<String>) items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
                if (data[index].equals(iterator.next())){
                    numberofitems++;
            }
        }
        if (numberofitems == itemsAdded){
            return true;
        }
        return false;
    }

    public boolean addAll(Collection<? extends DesiredType> items) {
        Iterator<String> iterator = (Iterator<String>) items.iterator();
        while (iterator.hasNext()) {
            if (i == size) {
                DesiredType[] newData = (DesiredType[]) new Object[size + 1];
                for (int i = 0; i < size; i++) {
                    System.out.println(i);
                    newData[i] = data[i];
                }
                data = newData;
                size++;
            }
            data[i] = (DesiredType) iterator.next();
            i++;
        }
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
