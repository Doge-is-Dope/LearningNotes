class Element:
    def __init__(self, value):
        self.head = value
        self.next = None

    def to


class LinkedList:
    def __init__(self, head=None):
        self.head = head

    def append(self, new_element):
        if self.head:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_element
        else:
            self.head = new_element



l = LinkedList()
l.append(Element("3"))
print(l.head)