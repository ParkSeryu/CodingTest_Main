def solution(S):
    D = {}
    for s in S.split():
        if s in D:
            D[s] += 1
        else:
            D[s] = 1
        answer = list(D.items())
        answer.sort(key=lambda x: x[0])
        return answer


S = input()
A = solution(S)
for name, value in A:
    print(name, value)
