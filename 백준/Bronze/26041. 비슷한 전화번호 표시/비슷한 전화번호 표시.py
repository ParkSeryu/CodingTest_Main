def solution(A, B):
    answer = 0
    for i in A:
        str = ""
        for j in range(len(i)):
            str += i[j]
            if str == B and i != B:
                answer += 1

    return answer


A = list(input().split())
B = input()
print(solution(A, B))
