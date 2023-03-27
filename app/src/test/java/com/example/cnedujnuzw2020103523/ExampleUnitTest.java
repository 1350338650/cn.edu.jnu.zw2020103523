package com.example.cnedujnuzw2020103523;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }
    @Test
    public void testAllOnes() throws Exception {
        Game g = new Game();
        for (int i = 0; i < 20; i++)
            g.roll(1);
        assertEquals(20, g.score());
    }

}