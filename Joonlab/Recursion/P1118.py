import sys

sys.setrecursionlimit(10 ** 6)


def solution(n):
    answer = 0
    for i in range(1, n + 1):
        answer += i

    return answer


def solution_recursion(n):
    return solve(n, 1)

def solve(n, m):
    if n >= m:
        return m + solve(n, m + 1)
    else:
        return 0

def fact(n):
    if n > 1:
        return n * fact(n - 1)
    else:
        return 1

n = int(input())
print(solution_recursion(n))
