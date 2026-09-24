package com.devops;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    
    @Test
    public void testAppStatus() {
        App app = new App();
        assertEquals("Active", app.getStatus());
    }
}