def solution(A, B):
    D = dict()
    answer = set()
    for i in B:
        D[i] = 0

    for i in A:
        if i not in D:
            answer.add(i)


    return sorted(list(answer))


A = list(input().split())
B = list(input().split())
C = solution(A, B)

for each in C:
    print(each)