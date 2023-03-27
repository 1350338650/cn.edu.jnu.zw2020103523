package com.example.cnedujnuzw2020103523;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private Game g;

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }
    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }
    @Test
    public void testAllOnes() throws Exception {
        rollMany(20,1);
        assertEquals(20, g.score());
    }
    @Test
    public void testOneSpare() throws Exception {
        rollSpare();
        g.roll(3);
        rollMany(17,0);
        assertEquals(16,g.score());

    }
    @Test
    public void testOneStrike() throws Exception {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.score());
    }
    private void rollStrike() {
        g.roll(10);
    }


}