def solution(N, M):
    answer = 0
    D = dict()
    for i in range(N + M):
        person = input()
        if person in D:
            D[person] += 1
        else:
            D[person] = 1

    answer = list(D.items())
    answer.sort(key=lambda x: x[0])

    return answer


N, M = map(int, input().split())
result = solution(N, M)
k = list()
for i in result:
    if i[1] == 2:
        k.append(i[0])
print(len(k))
for i in k:
    print(i)
        