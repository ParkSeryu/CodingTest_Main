from itertools import combinations, permutations


def solution(N, M):
    A = [str(i) for i in range(1, N + 1)]
    B = list(combinations(A, M))
    C = list(' '.join(b) for b in B)
    return C


N, M = map(int, input().split())
C = solution(N, M)
for c in C:
    print(c)
