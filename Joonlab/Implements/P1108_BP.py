def solution(n, A):
    T = [0] * 3600
    answer = []
    for a in A:
        if a[0] == '1':
            do_add_query(T, translate_time(a[1]), translate_time(a[2]))
        else:
            answer.append(T[translate_time(a[1])])
    return answer


def translate_time(t):
    return int(t[:2]) * 60 + int(t[3:])


def do_add_query(T, i, j):
    for p in range(i, j):
        T[p] += 1


n = int(input())
A = list(list(input().split()) for _ in range(n))
B = solution(n, A)
for b in B:
    print(b)