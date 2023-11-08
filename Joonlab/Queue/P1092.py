from collections import deque


def solution(n, A):
    m = [0, 0]
    q = deque()
    for i in A:
        if i[0] == 1:
            q.append(i[1])
            if len(q) > m[0]:
                m[0] = len(q)
                m[1] = q[len(q) - 1]
            elif len(q) == m[0]:
                if m[1] > q[len(q) - 1]:
                    m[1] = q[len(q) - 1]
        else:
            q.popleft()

    return m


n = int(input())
A = list(list(map(int, input().split())) for _ in range(n))
answer = solution(n, A)
print(answer[0], answer[1])
