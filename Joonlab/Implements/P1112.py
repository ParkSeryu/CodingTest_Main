from itertools import permutations


def solution(A, k):
    cnt = 1
    answer = sorted(permutations(A, len(A)))
    for i in answer:
        if ''.join(i) == k:
            print(cnt)
        cnt += 1


A, k = input().split()
solution(A, k)
