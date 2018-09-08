package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyDemo {
    @Test
    public void veriDemo(){
        String a = "ddd";
        String b = "aaa";
        Assert.assertEquals(a,b,"testsg");
    }


}
