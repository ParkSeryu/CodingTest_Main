A = list(map(int, input().split()))
B = list(map(int, input().split()))
a = b = 0

for i in range(len(A)):
    if A[i] > B[i]:
        a += 1
    elif B[i] > A[i]:
        b += 1

if a > b:
    print(1)
else:
    print(0)
