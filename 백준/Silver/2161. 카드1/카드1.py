from collections import deque

def solution(N):
    queue = deque()
    for i in range(1, N + 1):
        queue.append(i)

    while len(queue) > 1:
        print(queue.popleft())
        queue.append(queue.popleft())

    print(queue.popleft())

N = int(input())
solution(N)
