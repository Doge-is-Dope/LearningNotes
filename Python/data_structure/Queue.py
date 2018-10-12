# Queue FIFO
# enqueue: add an tail element
# dequeue: remove an head elemen
# peek: return the head element but don't remove it

"""Make a Queue class using a list!
Hint: You can use any Python list method
you'd like! Try to write each one in as
few lines as possible.
Make sure you pass the test cases too!"""


class Queue:
    def __init__(self, head=None):
        self.storage = [head]

    def enqueue(self, new_element):
        self.storage.append(new_element)

    def peek(self):
        return self.storage[0]

    def dequeue(self):
        return self.storage.pop(0)


if __name__ == '__main__':
    # Setup
    q = Queue(1)
    q.enqueue(2)
    q.enqueue(3)

    print(q.peek())  # Should be 1
    print(q.dequeue())  # Should be 1

    q.enqueue(4)

    print(q.dequeue())  # Should be 2
    print(q.dequeue())  # Should be 3
    print(q.dequeue())  # Should be 4

    q.enqueue(5)

    print(q.peek())  # Should be 5
