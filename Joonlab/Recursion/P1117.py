import sys

sys.setrecursionlimit(10 ** 6)


def solution(A):
    solve(A, 0)


def solve(A, B):
    if A > 0:
        if A % 10 != 0 or B == 1:
            print(A % 10, end='')
            B = 1
        solve(A // 10, B)


A = int(input())
solution(A)
B = 0

# def solution(A):
#     flag = 0
#     while A > 0:
#        if A % 10 != 0 or flag == 1:
#             print(A % 10, end = '')
#             flag = 1
#        A//= 10
#
# A = int(input())
# solution(A)
