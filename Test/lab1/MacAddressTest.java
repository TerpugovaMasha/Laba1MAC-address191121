package lab1;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MacAddressTest {

    @Test
    public void Chec1() {
        assertTrue(new MacAddress().Check("aE:dC:cA:56:76:54"));
    }

    @Test
    public void Chec2() {
        assertTrue(new MacAddress().Check("10:dC:cA:56:76:54"));
    }
}
