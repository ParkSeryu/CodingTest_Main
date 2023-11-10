def solution(A, k):
    while k > len(A):
        A += A[-1]

    answer = A

    return answer


A = input().strip()
k = int(input())
print(solution(A, k))
