def solution(n, m, A, B):
    answer = list()
    for i in B:
        cnt = 0
        cls = i[0]
        if cls == 1:
            for j in A:
                if j >= i[1]:
                    cnt += 1
        elif cls == 2:
            for j in A:
                if j > i[1]:
                    cnt += 1
        elif cls == 3:
            for j in A:
                if i[1] <= j <= i[2]:
                    cnt += 1
        answer.append(cnt)


    return answer


n, m = map(int, input().split())
A = list(map(int, input().split()))
B = list(list(map(int, input().split())) for _ in range(m))
C = solution(n, m, A, B)
for c in C:
    print(c)
