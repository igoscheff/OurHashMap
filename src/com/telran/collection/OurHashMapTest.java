package com.telran.collection;

        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;

public class OurHashMapTest {

    OurHashMap<Integer, String> testHashMap = new OurHashMap<>();

    @Before
    public void setOurHashMap() {
        testHashMap.put(001, "AAA");
        testHashMap.put(002, "BBB");
        testHashMap.put(003, "CCC");
        testHashMap.put(004, "DDD");
        testHashMap.put(005, "EEE");
    }

    @Test
    public void testNewListCreate() {
        OurHashMap<Integer, Integer> listCreate = new OurHashMap<>();
        Assert.assertEquals(0, listCreate.size());
        listCreate.put(1, 777);
        listCreate.put(2, 999);
        Assert.assertEquals(2,listCreate.size());
    }

    @Test
    public void testPut() {
        Assert.assertEquals(5, testHashMap.size());
    }

    @Test
    public void testPutOverwrite() {
        testHashMap.put(001, "AAA");
        testHashMap.put(001, "BBB");
        Assert.assertEquals("BBB", testHashMap.get(001));
    }

    @Test
    public void testGet() {
        Assert.assertEquals("AAA", testHashMap.get(001));
        Assert.assertEquals("BBB", testHashMap.get(002));
        Assert.assertEquals("CCC", testHashMap.get(003));
        Assert.assertEquals("DDD", testHashMap.get(004));
        Assert.assertEquals("EEE", testHashMap.get(005));
    }

    @Test
    public void testContains() {
        Assert.assertTrue(testHashMap.contains(001));
        Assert.assertTrue(testHashMap.contains(002));
        Assert.assertTrue(testHashMap.contains(003));
        Assert.assertTrue(testHashMap.contains(004));
        Assert.assertTrue(testHashMap.contains(005));

        Assert.assertFalse(testHashMap.contains(007));
    }

    @Test
    public void testRemove() {
        testHashMap.remove(001);
        Assert.assertFalse(testHashMap.contains(001));
        Assert.assertEquals(null, testHashMap.get(001));
    }

    @Test
    public void testSize() {
        testHashMap.remove(001);
        testHashMap.remove(002);
        Assert.assertEquals(3, testHashMap.size());
    }

}
