n, k = map(int, input().split())
A = list(map(int, input().split()))
cnt = 0

for i in A:
    if i == k:
        cnt += 1

print(cnt)