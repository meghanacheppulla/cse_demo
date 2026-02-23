package cse.cse_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class cserocksTest {

    cserocks cal = new cserocks();   // ✅ Correct class name

    @Test
    void testAdd() {
        assertEquals(5, cal.add(2,3));
    }

    @Test
    void testMul() {
        assertEquals(6, cal.mul(2,3));
    }
}