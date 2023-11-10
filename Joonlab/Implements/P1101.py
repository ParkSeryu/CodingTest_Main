def solution(A, k):
    while k > len(A):
        A = A[0] + A


    return A


A = input().strip()
k = int(input())
print(solution(A, k))
