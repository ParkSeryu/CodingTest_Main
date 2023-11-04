n = int(input())
A = list(map(int, input().split()))
i, j, k = map(int, input().split())

for l in range(i, j + 1):
    A[l] *= k

print(sum(A))
