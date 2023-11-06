def solution(country, index):
    d = dict()
    for c in country:
        d[c] = 1

    s = 0

    for i in d:
        s += d[i]

    answer = "Week " + str(index) + " " + str(s)
    return answer


index = 0
while True:
    index += 1
    N = int(input())
    if N == 0:
        break
    country = list()
    for i in range(N):
        country.append(input())

    print(solution(country, index))
