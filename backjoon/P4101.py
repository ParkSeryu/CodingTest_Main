while True:
    A, B = map(int, input().split())
    if A == 0:
        break
    if A > B:
        print('Yes')
    else:
        print('No')
    