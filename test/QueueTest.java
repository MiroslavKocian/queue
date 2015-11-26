import junit.framework.TestCase;

public class QueueTest extends TestCase {

    public void testEnqueueDequeueAndPeek() throws Exception {
        Queue queue = new Queue();
        queue.enqueue(1);
        assertEquals(1,queue.peek());
        queue.enqueue(2);
        assertEquals(1, queue.peek());
        queue.enqueue("Miro");
        assertEquals(1, queue.peek());
        queue.enqueue(4);
        assertEquals(1,queue.peek());

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals("Miro", queue.dequeue());
        assertEquals(4, queue.dequeue());
        assertEquals(null, queue.dequeue());
        assertEquals(null, queue.peek());
    }
}