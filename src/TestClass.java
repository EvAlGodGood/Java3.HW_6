//import org.junit.Assert;
//import org.junit.Test;
//
////похоже JUnit неверно подключен... 0 test classes found in package '<default package>'
////да зафурычило )))
//
//public class TestClass {
//
//    @Test
//    public void test1(){
//        int[] ts ={1, 1, 1, 4, 1, 1, 1, 4};
//        Metods mt = new Metods();
//        Assert.assertTrue(mt.avail(ts));
//    }
//    @Test
//    public void test2(){
//        int[] ts ={1, 1, 1, 1, 1, 1};
//        Metods mt = new Metods();
//        Assert.assertFalse(mt.avail(ts));
//    }
//    @Test
//    public void test3(){
//        int[] ts ={1, 1, 1, 5, 1, 1, 1, 4};
//        Metods mt = new Metods();
//        Assert.assertFalse(mt.avail(ts));
//    }
//
//
//    @Test
//    public void test4(){
//        int[] ts = {1, 2, 4, 4, 2, 3, 4, 1, 7};
//        int[] tss = {1,7};
//        Metods mtt = new Metods();
//        Assert.assertArrayEquals(tss, mtt.cutFour(ts));
//
//    }
//    @Test
//    public void test5(){
//        int[] ts = {1, 2, 4, 4, 2, 3, 0, 1, 7};
//        int[] tss = {2, 3, 0, 1, 7};
//        Metods mtt = new Metods();
//        Assert.assertArrayEquals(tss, mtt.cutFour(ts));
//
//    }
//    @Test
//    public void test6(){
//        int[] ts = {1, 2, 4, 0, 2, 3, 0, 1, 7};
//        int[] tss = {0, 2, 3, 0, 1, 7};
//        Metods mtt = new Metods();
//        Assert.assertArrayEquals(tss, mtt.cutFour(ts));
//
//    }
//}
