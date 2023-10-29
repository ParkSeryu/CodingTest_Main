A, B = map(int, input().split())
su = list()
cnt = 0
i = 1
total = 0
su.append(0)
for idx in range(1001):
    su.append(i)
    cnt += 1
    if cnt == i:
        cnt = 0
        i += 1

for i in range(A, B + 1):
    total += su[i]

print(total)