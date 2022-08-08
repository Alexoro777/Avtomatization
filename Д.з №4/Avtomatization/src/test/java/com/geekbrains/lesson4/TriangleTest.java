package com.geekbrains.lesson4;

import lesson4.AreaTriangle;
import lesson4.TriangleSideLessThanZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void triangleTest() throws TriangleSideLessThanZeroException {
        Assertions.assertEquals(AreaTriangle.calculateTriangle(4,6,8),11.6189, 0.001);
    }

    @Test
    void triangleNegativeTest() {
        Assertions.assertThrows(Exception.class, () -> AreaTriangle.calculateTriangle(-5, 3, 3));
    }

    @Test
    void triangleNegTest() {
        Assertions.assertThrows(Exception.class, () -> AreaTriangle.calculateTriangle(2, 4, 8));
    }


}
