package util;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

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
}