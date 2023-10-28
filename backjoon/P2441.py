N = int(input())
for i in range(0, N):
    for b in range(N - i, N):
        print(' ', end='')
    for j in range(N - i, 0, -1):
        print('*', end='')
    print()