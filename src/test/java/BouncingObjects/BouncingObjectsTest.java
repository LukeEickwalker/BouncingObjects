package BouncingObjects;

import org.junit.Test;
import static org.junit.Assert.*;

public class BouncingObjectsTest {
    @Test public void testAppHasAGreeting() {
        BouncingObjects classUnderTest = new BouncingObjects();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
