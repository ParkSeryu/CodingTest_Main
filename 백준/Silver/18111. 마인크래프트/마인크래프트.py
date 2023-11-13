import sys


def solution(N, M, B, ground):
    answer = [2 ** 63 - 1, 0]
    candidate = list(i for i in range(min(map(min, ground)), (max(map(max, ground)) + 1)))
    for i in candidate:
        time = check_candidate(B, i, ground, answer[0])
        if time != -1:
            answer[0] = min(answer[0], time)
            if answer[0] == time:
                answer[1] = max(answer[1], i)
            else:
                answer[1] = min(answer[1], i)
    return answer


def check_candidate(B, candidate, ground, ref_time):
    time = 0
    if candidate * len(ground) * len(ground[0]) - sum(sum(row) for row in ground) > B:
        return -1

    for i in range(len(ground)):
        g = ground[i]
        for j in range(len(ground[i])):
            if ref_time < time:
                return -1
            if g[j] > candidate:
                time += 2 * (g[j] - candidate)
            if ground[i][j] < candidate:
                time += candidate - g[j]
    return time


input = sys.stdin.readline
N, M, B = map(int, input().split())
ground = list(list(map(int, input().split())) for _ in range(N))
result = solution(N, M, B, ground)
for r in result:
    print(r, end=' ')
