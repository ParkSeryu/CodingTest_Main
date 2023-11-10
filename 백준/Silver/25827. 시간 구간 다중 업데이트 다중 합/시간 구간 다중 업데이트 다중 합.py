def solution(n, A):
    T = [0] * 86400
    for i in range(len(A)):
        if A[i][0] == '1':
            h1, m1, s1 = map(int, A[i][1].split(':'))
            t1 = (h1 * 3600) + (m1 * 60) + s1
            h2, m2, s2 = map(int, A[i][2].split(':'))
            t2 = (h2 * 3600) + (m2 * 60) + s2
            for t in range(t1, t2):
                T[t] += 1
        else:
            h3, m3, s3 = map(int, A[i][1].split(':'))
            t3 = (h3 * 3600) + (m3 * 60) + s3
            h4, m4, s4 = map(int, A[i][2].split(':'))
            t4 = (h4 * 3600) + (m4 * 60) + s4
            su = 0
            for k in range(t3, t4):
                su += T[k]
            print(su)

n = int(input())
A = list(input().split() for _ in range(n))
solution(n, A)
