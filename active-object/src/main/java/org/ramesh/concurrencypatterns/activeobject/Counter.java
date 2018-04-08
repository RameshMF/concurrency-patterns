package org.ramesh.concurrencypatterns.activeobject;

/**
 * @author Tomas Zezula
 *
 * This interface shadows a subset of functionality of java.util.concurrent.atomic.AtomicLong
 */
public interface Counter {

    /**
     * Gets the current value
     * @return the current value
     */
    long get();

    /**
     * Atomically increments the value by one
     * @return the incremented value
     */
    long incrementAndGet();

    /**
     * Atomically increments the value by one
     * @return the current (non-incremented) value
     */
    long getAndIncrement();

    /**
     * Atomically decrements the value by one
     * @return the decremented value
     */
    long decrementAndGet();

    /**
     * Atomically decrements the value by one
     * @return the current (non-decremented) value
     */
    long getAndDecrement();
}
