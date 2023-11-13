def solution(T, data):
    answer = list()
    for i in data:
        while "()" in i:
            i = i.replace("()", "")
        if len(i) > 0:
            answer.append("NO")
        else:
            answer.append("YES")
    return answer


T = int(input())
data = list(input() for i in range(T))
result = solution(T, data)
for i in result:
    print(i)
