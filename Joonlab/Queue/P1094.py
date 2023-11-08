from collections import deque


def solution(n, S):
    answer = list()
    A = list()
    B = list()
    C = list()
    queue = deque()

    for info in S:
        if info[0] == 1:
            queue.append((info[1], info[2]))
        else:
            stu, want = queue.popleft()
            meal = info[1]
            if want == meal:
                A.append(stu)
            else:
                B.append(stu)
    while len(queue) > 0:
        s = queue.popleft()
        C.append(s[0])

    A.sort()
    B.sort()
    C.sort()
    answer.append(A)
    answer.append(B)
    answer.append(C)

    return answer


n = int(input())
S = list(list(map(int, input().split())) for _ in range(n))
ans = solution(n, S)

for i in ans:
    if len(i) == 0:
        print('None')
    else:
        for j in i:
            print(j, end=' ')
        print()
