from queue import PriorityQueue
q = PriorityQueue()
q.put(2)
q.put(1)
q.put(3)

x = q.get()
y = q.get()
z = q.get()
print(x, y, z)