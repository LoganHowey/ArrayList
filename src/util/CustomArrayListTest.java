package util;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class CustomArrayListTest {

    @Test
    public void listIsEmptyIfNothingIsAdded(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.isEmpty();
        Assert.assertThat(objectList.isEmpty(), Is.is(true));
    }

    @Test
    public void addOneItemIncreasesSize(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Things");
        Assert.assertThat(objectList.size(), Is.is(1));
    }

    @Test
    public void addMultipleItemIncreasesSize(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Things");
        objectList.add("Things1");
        objectList.add("Things2");
        Assert.assertThat(objectList.size(), Is.is(3));
    }

    @Test
    public void getReturnsAnItemAtIndex(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Things");
        objectList.add("2nd Things");
        Assert.assertThat(objectList.get(0), Is.is("Things"));
        Assert.assertThat(objectList.get(1), Is.is("2nd Things"));
        }

    @Test
    public void removeItemAtIndexDecreasesSize(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Things");
        objectList.add("Things1");
        objectList.add("Things2");
        objectList.remove(0);
        Assert.assertThat(objectList.size(), Is.is(2));
    }
    @Test
    public void removeItemAtIndexMovesItemsDownOneIndex(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Things");
        objectList.add("Things1");
        objectList.add("Things2");
        objectList.remove(0);
        Assert.assertThat(objectList.get(0), Is.is("Things1"));
        Assert.assertThat(objectList.get(1), Is.is("Things2"));
        Assert.assertThat(objectList.size(), Is.is(2));
        Assert.assertNull(objectList.get(2));
    }
    @Test
    public void removeItemAtIndexMovesItemsDownOneIndexAddingBackGoesIntoLastIndex(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Things");
        objectList.add("Things1");
        objectList.add("Things2");
        objectList.remove(0);
        objectList.add("Things2 2.0");
        Assert.assertThat(objectList.get(0), Is.is("Things1"));
        Assert.assertThat(objectList.get(1), Is.is("Things2"));
        Assert.assertThat(objectList.get(2), Is.is("Things2 2.0"));
        Assert.assertThat(objectList.size(), Is.is(3));
    }

    @Test
    public void listIsEmptyIfAllItemsRemoved(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Things");
        objectList.add("Things1");
        objectList.remove(0);
        objectList.remove(0);
        Assert.assertThat(objectList.size(), Is.is(0));
    }
    @Test
    public void listContainsCheck() {
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Things");
        objectList.add("Others");
        Assert.assertThat(objectList.contains("Things"), Is.is(true));
        Assert.assertThat(objectList.contains("Others"), Is.is(true));
        Assert.assertThat(objectList.contains("Other"), Is.is(false));
    }

    @Test
    public void removeViaObjectCheck(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Things");
        objectList.add("Others");
        objectList.remove("Things");
        Assert.assertThat(objectList.size(), Is.is(1));
        Assert.assertThat(objectList.get(0), Is.is("Others"));
    }
    @Test
        public void removeViaObjectInRandomOrder(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Things");
        objectList.add("Others");
        objectList.add("Testing");
        objectList.add("Random");
        objectList.add("Objects");
        objectList.add("Here");
        objectList.remove("Things");
        objectList.remove("Here");
        objectList.remove("Random");
        objectList.remove("Others");
        Assert.assertThat(objectList.size(), Is.is(2));
        Assert.assertThat(objectList.get(0), Is.is("Testing"));
    }

    @Test
    public void indexOfCheck(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Index 0");
        objectList.add("Index 1");
        objectList.add("Index 2");
        objectList.add("Index 3");
        objectList.add("Index 4");
        Assert.assertThat(objectList.indexOf("Index 0"), Is.is(0));
        Assert.assertThat(objectList.indexOf("Index 1"), Is.is(1));
        Assert.assertThat(objectList.indexOf("Index 2"), Is.is(2));
        Assert.assertThat(objectList.indexOf("Index 3"), Is.is(3));
        Assert.assertThat(objectList.indexOf("Index 4"), Is.is(4));
    }
    @Test
    public void indexOfDoesNotExist(){
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        objectList.add("Index 0");
        objectList.add("Index 1");
        objectList.add("Index 2");
        objectList.add("Index 3");
        objectList.add("Index 4");
        Assert.assertThat(objectList.indexOf("Index 0"), Is.is(0));
        Assert.assertThat(objectList.indexOf("Index 1"), Is.is(1));
        Assert.assertThat(objectList.indexOf("Index 5"), Is.is(999999));
        Assert.assertThat(objectList.indexOf("Index 3"), Is.is(3));
        Assert.assertThat(objectList.indexOf("Index 4"), Is.is(4));
    }

    @Test
    public void toArrayCheck() {
        CustomArrayList<Object> objectList = new CustomArrayList<>();
        Collection<String> collection = new ArrayList<String>();
        collection.add("Index 0");
        collection.add("Index 1");
        objectList.add("Index 0");
        objectList.add("Index 1");
        objectList.add("Index 2");
        objectList.add("Index 3");
        objectList.add("Index 4");
        Assert.assertThat(objectList.containsAll(collection), Is.is(true));


    }


}