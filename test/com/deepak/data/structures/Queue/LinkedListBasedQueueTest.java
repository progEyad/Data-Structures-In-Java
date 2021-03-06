/**
 * Data-Structures-In-Java
 * LinkedListBasedQueueTest.java
 */
package com.deepak.data.structures.Queue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for linked list based queue
 * 
 * @author Deepak
 */
public class LinkedListBasedQueueTest {

	/**
	 * Test case for enqueue feature
	 */
	@Test
	public void testEnqueue() {
		LinkedListBasedQueue queue = new LinkedListBasedQueue();
		Assert.assertTrue(queue.isEmpty());
		Assert.assertTrue(queue.size() == 0);
		queue.enqueue(3);
		Assert.assertFalse(queue.isEmpty());
		Assert.assertTrue(queue.size() == 1);
		queue.enqueue(7);
		queue.enqueue(31);
		Assert.assertTrue(queue.size() == 3);
	}

	/**
	 * Test case for dequeue feature
	 */
	@Test
	public void testDequeue() {
		LinkedListBasedQueue queue = new LinkedListBasedQueue();
		Assert.assertTrue(queue.isEmpty());
		Assert.assertTrue(queue.size() == 0);
		queue.enqueue(3);
		queue.enqueue(17);
		queue.enqueue(35);
		queue.enqueue(13);
		Assert.assertTrue(queue.size() == 4);
		Assert.assertEquals(queue.dequeue(), 3);
		Assert.assertEquals(queue.dequeue(), 17);
		Assert.assertEquals(queue.dequeue(), 35);
		Assert.assertTrue(queue.size() == 1);
	}

	/**
	 * Test case for peek feature
	 */
	@Test
	public void testPeek() {
		LinkedListBasedQueue queue = new LinkedListBasedQueue();
		Assert.assertTrue(queue.isEmpty());
		Assert.assertTrue(queue.size() == 0);
		queue.enqueue(3);
		queue.enqueue(17);
		queue.enqueue(35);
		queue.enqueue(13);
		Assert.assertTrue(queue.size() == 4);
		Assert.assertEquals(queue.peek(), 3);
		Assert.assertTrue(queue.size() == 4);
		queue.dequeue();
		Assert.assertTrue(queue.size() == 3);
		Assert.assertEquals(queue.peek(), 17);
	}

}
