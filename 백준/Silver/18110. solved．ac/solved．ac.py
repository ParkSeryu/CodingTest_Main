import math


def solution(n, A):
    jul = _round(n / 100 * 15)  # 절사평균
    A.sort()
    if jul != 0:
        su = A[jul: -jul]
        answer = _round(sum(su) / len(su))
    else:
        answer = sum(A)

    return answer


def _round(num):
    check = (num % 1) / 0.1
    if check < 5:
        return math.floor(num)
    else:
        return math.ceil(num)


n = int(input())
if n == 0:
    print(0)
else:
    A = list(int(input()) for _ in range(n))
    print(solution(n, A))
