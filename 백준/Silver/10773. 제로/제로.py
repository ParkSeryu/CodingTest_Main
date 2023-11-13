def solution(K):
    A = list()
    for i in range(K):
        su = int(input())
        if su != 0:
            A.append(su)
        else:
            A.pop()
    answer = sum(A)
    return answer


K = int(input())
print(solution(K))
