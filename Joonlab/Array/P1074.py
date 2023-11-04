n, k = map(int, input().split())
answer = 0

for i in range(n):
    A = list(map(int, input().split()))
    for j in A:
        if j == k:
            answer += 1

print(answer)

