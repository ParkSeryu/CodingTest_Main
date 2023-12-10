from itertools import permutations


def solution(A, k):
    answer = sorted(permutations(A, len(A)))
    print(''.join(answer[int(k) - 1]))


A, k = input().split()
solution(A, k)
