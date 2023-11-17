blank = ['(', ')', '[', ']']
com = ['()', '[]']

while True:
    S = input().rstrip()
    if S == '.':
        break
    else:
        A = list()
        for i in S:
            if i in blank:
                A.append(i)
        B = ''.join(A)
        while True:
            if com[0] in B:
                B = B.replace(com[0], '')
            elif com[1] in B:
                B = B.replace(com[1], '')
            else:
                break
        if len(B) > 0:
            print('no')
        else:
            print('yes')

 