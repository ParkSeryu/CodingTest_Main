from itertools import combinations


def solution(A, k):
    answer = list(combinations(A, k))
    return list(map(''.join, sorted(answer)))


A = input().strip()
k = int(input())
C = solution(A, k)
for c in C:
    print(c)