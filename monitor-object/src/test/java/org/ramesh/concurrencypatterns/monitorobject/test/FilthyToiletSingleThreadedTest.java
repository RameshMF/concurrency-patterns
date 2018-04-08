package org.ramesh.concurrencypatterns.monitorobject.test;

import org.junit.Before;
import org.junit.Test;
import org.ramesh.concurrencypatterns.monitorobject.FilthyToilet;
import org.ramesh.concurrencypatterns.monitorobject.Toilet;
import org.ramesh.concurrencypatterns.monitorobject.ToiletFloodedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FilthyToiletSingleThreadedTest {

    private Toilet toilet;

    @Before
    public void init() {
        toilet = new FilthyToilet();
    }

    @Test
    public void acquireVacantToilet() throws ToiletFloodedException {
        assertTrue(toilet.enter());
        assertTrue(toilet.isOccupied());
    }

    @Test
    public void leaveOccupiedToilet() throws ToiletFloodedException {
        toilet.enter();
        toilet.quit();
        assertFalse(toilet.isOccupied());
    }
}
