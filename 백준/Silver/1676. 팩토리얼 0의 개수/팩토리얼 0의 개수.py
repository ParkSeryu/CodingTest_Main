def solution(N):
    answer = 0
    f = str(factorial(N))
    for i in range(len(f) - 1, 0, -1):
        if f[i] == '0':
            answer += 1
        else:
            break
    return answer


def factorial(N):
    if N > 1:
        return N * factorial(N - 1)
    else:
        return 1


N = int(input())
print(solution(N))
