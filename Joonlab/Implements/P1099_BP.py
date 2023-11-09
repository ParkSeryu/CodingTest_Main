def solution(n, m, A, B):
    for b in B:
        if b[0] == 1:
            do_add_query(A, b[1], b[2], b[3], b[4], b[5])
        else:
            print(get_sum(A, b[1], b[2], b[3], b[4]))


def do_add_query(A, i1, j1, i2, j2, k):
    for i in range(i1, i2 + 1):
        for j in range(j1, j2 + 1):
            A[i][j] += k


def get_sum(A, i1, j1, i2, j2):
    ret = 0
    for i in range(i1, i2 + 1):
        for j in range(j1, j2 + 1):
            ret += A[i][j]
    return ret


n, m = map(int, input().split())
A = list(list(map(int, input().split())) for _ in range(n))
B = list(list(map(int, input().split())) for _ in range(m))
solution(n, m, A, B)
