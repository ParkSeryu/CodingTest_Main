def solution(N, M):
    answer = 0
    D = dict()
    for i in range(N + M):
        person = input()
        if person in D:
            D[person] += 1
        else:
            D[person] = 1

    answer = list()
    for key, value in D.items():
        if value == 2:
            answer.append(key)

    answer.sort()

    return answer


N, M = map(int, input().split())
result = solution(N, M)
print(len(result))
for i in result:
    print(i)
