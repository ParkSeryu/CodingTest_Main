def solution(n, A):
    T = [0] * 3600
    for i in range(len(A)):
        if A[i][0] == '1':
            m1, s1 = map(int, A[i][1].split(':'))
            t1 = m1 * 60 + s1
            m2, s2 = map(int, A[i][2].split(':'))
            t2 = m2 * 60 + s2
            for t in range(t1, t2):
                T[t] += 1
        else:
            m, s = map(int, A[i][1].split(':'))
            print(T[m * 60 + s])


n = int(input())
A = list(input().split() for _ in range(n))
solution(n, A)
