from itertools import permutations
def solution(A):
    answer = sorted(permutations(A, len(A)))
    for i in answer:
        print(''.join(i))

A = input()
solution(A)