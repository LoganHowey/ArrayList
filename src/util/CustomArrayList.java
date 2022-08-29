package util;

import java.util.Collection;

public class CustomArrayList<DesiredType> {

    private int size = 20;
    public DesiredType[] data = (DesiredType[]) new Object[size];
    private int i = 0;

    public int size(){
        return i;
    }

    public boolean isEmpty(){
        if (i==0){
            return true;
        }
        return false;
    }

    public void clear(){

    }

    public Object[] toArray(){
        return null;
    }

     public boolean contains(Object toFind){
        return false;
     }

     public void add(DesiredType item){
        data[i] = item;
        i++;
     }

     public DesiredType get(int index){
        return data[index];
     }

     public DesiredType remove(Object item){
        return null;
     }

     public boolean containsAll(Collection<?extends DesiredType> items){
        return false;
     }

     public boolean addAll(Collection<?extends DesiredType> items){
        return false;
     }

     public boolean addAll(int index, Collection<?extends DesiredType> items){
        return false;
     }

     public boolean removeAll(Collection<?extends DesiredType> items){
        return false;
     }

     public DesiredType set(int index, DesiredType item){
        return null;
     }

     public DesiredType remove(int index){
        //remove item at specified index, move the items ahead back one to fill the arraylist.
         for (index >= data.size(); )
        return null;
     }

     public int indexOf(Object item){
        return 0;
     }

     public int lastIndexOf(Object item){
        return 0;
     }
}
