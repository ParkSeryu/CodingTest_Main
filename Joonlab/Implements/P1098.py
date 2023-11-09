def solution(n, m, A, B):
    answer = list()
    for i in B:
        if i[0] == 1:
            for idx in range(i[1], i[2] + 1):
                A[idx] += i[3]
        else:
            s = 0
            for j in range(i[1], i[2] + 1):
                s += A[j]
            answer.append(s)
    return answer


n, m = map(int, input().split())
A = list(map(int, input().split()))
B = list(list(map(int, input().split())) for i in range(m))
C = solution(n, m, A, B)
for c in C:
    print(c)