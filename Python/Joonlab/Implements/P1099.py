def solution(n, m, A, B):
    answer = 0
    for b in B:
        if b[0] == 1:
            add_array(A, b[1], b[2], b[3], b[4], b[5])
        else:
            s = 0
            for i in range(b[1], b[3] + 1):
                for j in range(b[2], b[4] + 1):
                    s += A[i][j]
            print(s)
    return answer

# best practidce와 거의 일치함

def add_array(A, i1, j1, i2, j2, k):
    for i in range(i1, i2 + 1):
        for j in range(j1, j2 + 1):
            A[i][j] += k


n, m = map(int, input().split())
A = list(list(map(int, input().split())) for _ in range(n))
B = list(list(map(int, input().split())) for _ in range(m))
solution(n, m, A, B)
