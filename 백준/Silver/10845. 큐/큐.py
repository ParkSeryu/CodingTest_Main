from collections import deque


def solution(N, command):
    queue = deque()
    for i in command:
        if 'push' in i:
            a, b = i.split()
            queue.append(b)
        elif i == 'pop':
            if queue_length(queue) > 0:
                print(queue.popleft())
            else:
                print(-1)
        elif i == 'size':
            print(len(queue))
        elif i == 'empty':
            if queue_length(queue) > 0:
                print(0)
            else:
                print(1)
        elif i == 'front':
            if queue_length(queue) > 0:
                print(queue[0])
            else:
                print(-1)
        elif i == 'back':
            if queue_length(queue) > 0:
                print(queue[len(queue) - 1])
            else:
                print(-1)

def queue_length(queue):
    if len(queue) > 0:
        return True
    return False
    

N = int(input())
command = list(input() for _ in range(N))
solution(N, command)
