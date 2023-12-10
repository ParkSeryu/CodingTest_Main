n = int(input())
A = list(list(map(int, input().split())) for _ in range(n))
i1, j1, i2, j2, k = map(int, input().split())

for i in range(i1, i2 + 1):
    for j in range(j1, j2 + 1):
        A[i][j] *= k

print(sum(sum(row) for row in A))
