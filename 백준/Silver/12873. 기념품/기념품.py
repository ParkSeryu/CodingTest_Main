from collections import deque


def solution(N):
    queue = list()
    t = 1
    start = 0

    for i in range(1, N + 1):
        queue.append(i)

    while len(queue) > 1:
        idx = (t ** 3) % len(queue)
        remove = (start + idx - 1) % len(queue)
        if remove < 0 :
            remove += len(queue)
        queue.pop(remove)
        start = remove
        t += 1

    answer = queue[0]
    return answer


N = int(input())
print(solution(N))
