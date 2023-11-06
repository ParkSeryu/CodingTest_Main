def solution(N, M):
    answer = 0
    S = list()
    D = dict()
    for i in range(N):
        S.append(input())

    for each in S:
        D[each] = 0

    for _ in range(M):
        C = input()
        if C in D:
            D[C] += 1

    answer = sum(D.values())

    return answer


N, M = map(int, input().split())
print(solution(N, M))
