def solution(n, m, like, question):
    answer = list()
    for q in question:
        cnt = 0
        if q == '-':
            answer.append(n)
        else:
            for lk in like:
                if q == lk:
                    cnt += 1
            answer.append(cnt)

    return answer


n, m = map(int, input().split())
like = list(input().split())
question = list(input().strip() for _ in range(m))
result = solution(n, m, like, question)
for r in result:
    print(r)
