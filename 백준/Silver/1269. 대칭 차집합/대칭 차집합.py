def solution(cnt_A, cnt_B, A, B):
    answer = 0
    dict_A = {}
    dict_B = {}

    for i in A:
        dict_A[i] = 0
    for i in B:
        dict_B[i] = 0

    for i in A:
        if i not in dict_B:
            answer += 1

    for i in B:
        if i not in dict_A:
            answer += 1
    return answer


cnt_A, cnt_B = map(int, input().split())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
print(solution(cnt_A, cnt_B, A, B))
