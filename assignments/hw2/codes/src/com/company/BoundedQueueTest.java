package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoundedQueueTest {

    private BoundedQueue queue;

    @BeforeEach
    void setUp() {
        queue = new BoundedQueue(3);
    }

    @Test
    void testEnQueue() {
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        // Check that elements are added in the correct order
        Assertions.assertEquals("[A, B, C]", queue.toString());

        // Check that adding one more element throws an exception
        Assertions.assertThrows(IllegalStateException.class, () -> queue.enQueue("D"));
    }

    @Test
    void testDeQueue() {
        // Test that dequeueing an empty queue throws an exception
        Assertions.assertThrows(IllegalStateException.class, () -> queue.deQueue());

        // Test that dequeueing returns elements in the correct order
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        Assertions.assertEquals("A", queue.deQueue().toString());
        Assertions.assertEquals("B", queue.deQueue().toString());
        Assertions.assertEquals("C", queue.deQueue().toString());

        // Test that dequeueing from an empty queue throws an exception
        Assertions.assertThrows(IllegalStateException.class, () -> queue.deQueue());
    }

    @Test
    void testIsEmpty() {
        // Test that a newly created queue is empty
        Assertions.assertTrue(queue.isEmpty());

        // Test that a non-empty queue is not empty
        queue.enQueue("A");
        Assertions.assertFalse(queue.isEmpty());

        // Test that an empty queue is still empty after dequeueing
        queue.deQueue();
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    void testIsFull() {
        // Test that a newly created queue is not full
        Assertions.assertFalse(queue.isFull());

        // Test that a full queue is indeed full
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        Assertions.assertTrue(queue.isFull());

        // Test that a non-full queue is still not full after dequeueing
        queue.deQueue();
        Assertions.assertFalse(queue.isFull());
    }
}

