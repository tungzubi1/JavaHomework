import org.junit.Assert;
import org.junit.Test;

public class Execute {
    Script ex = new Script();

    @Test
    public void AssertEquals(){
        Assert.assertEquals(2, ex.sum(1,1));
        Assert.assertEquals(4, ex.division(16,4),0.0);
        Assert.assertEquals(0, ex.sub(1,1));
        Assert.assertEquals(4, ex.mul(2,2));
    }

    @Test
    public void AssertNotEquals(){
        Assert.assertNotEquals(4, ex.sum(1,1));
        Assert.assertNotEquals(3, ex.division(16,4),0.0);
        Assert.assertNotEquals(1, ex.sub(1,1));
        Assert.assertNotEquals(3, ex.mul(2,2));
    }

    @Test
    public void AssertArrayEquals(){
        int a[]={1,2,3,4};
        int b[]={1,2,3,4};
        Assert.assertArrayEquals(a,b);
    }

    @Test
    public void AssertNull(){
        String str = null;
        Assert.assertNull(str);
    }

    @Test
    public void AssertNotNull(){
        String str = "Hello";
        Assert.assertNotNull(str);
    }

    @Test
    public void AssertTrue(){
        Assert.assertTrue(ex.checkTriangle(3,2,3));
    }

    @Test
    public void AssertFalse(){
        Assert.assertFalse(ex.sole(1,2,3));
    }

    @Test
    public void AsserSameAndNotSame(){
        String str = "Hello";
        String clonestr = str;
        String str2 = "Let's go";
        Assert.assertSame(str,clonestr);
        Assert.assertNotSame(clonestr,str2);

    }
}
