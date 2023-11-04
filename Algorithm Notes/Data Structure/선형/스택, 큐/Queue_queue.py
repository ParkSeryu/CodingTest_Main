from queue import Queue

q = Queue()
q.put(1)
q.put(2)
q.put(3)

x = q.get()
y = q.get()
z = q.get()

print(x, y, z)
# 1 2 3
