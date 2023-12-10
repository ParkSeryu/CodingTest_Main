def solution(S):
    D = dict()
    for each in S:
        if each in D:
            D[each] += 1
        else:
            D[each] = 1

    D1 = dict(sorted(D.items()))

    for key in D1.keys():
        print(key, D1[key])


S = input().split()
solution(S)
