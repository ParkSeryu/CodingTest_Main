def solution(n):
    return solve(n)


def solve(n):
    if n <= 2:
        return 1
    else:
        return solve(n - 1) + solve(n - 2)


n = int(input())
if n == 0:
    print(0)
else:
    print(solution(n))
