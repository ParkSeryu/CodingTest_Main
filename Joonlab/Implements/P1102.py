def solution(A, k):
    A = A[0] * (k - len(A)) + A
    return A


A = input().strip()
k = int(input())
print(solution(A, k))
