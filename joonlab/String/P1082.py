A = list(input())
B = input()

for i in range(len(A)):
    if A[i] in B:
        A[i] = A[i].lower()


print(''.join(A))