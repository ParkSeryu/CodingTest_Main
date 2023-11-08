def solution(A):
    D = dict()
    mx = 0
    answer = list()
    for i in A:
        if i in D:
            D[i] += 1
        else:
            D[i] = 1
        mx = max(mx, D[i])

    for key, values in D.items():
        if values == mx:
            answer.append(key)

    answer.sort()
    return answer


n = int(input())
A = list(map(int, input().split()))
for i in solution(A):
    print(i)
