def solution(n):
    start = 1
    for i in range(1, n):
        start *= 10
    end = 10 ** n

    answer = 0

    for i in range(start, end):
        if is_ok(i):
            answer += 1
    return answer


def is_ok(i):
    p = i % 10
    i //= 10
    if p == 0:
        return False
    while i > 0:
        c = i % 10
        i //= 10

        if c == 0 or abs(p - c) > 2:
            return False

        p = c
    return True

n = int(input())
print(solution(n))
