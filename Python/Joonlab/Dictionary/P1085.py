def solution(n, A, m, B):
    D = dict()

    for name, cost in A:
        D[name] = int(cost)

    answer = 0
    for name in B:
        answer += D[name]

    return answer


n, m = map(int, input().split())
A = list(list(input().split()) for _ in range(n))
B = list(input().split())
print(solution(n, A, m, B))
