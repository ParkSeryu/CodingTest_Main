def solution(S):
    T = ''
    i = 0

    while i < len(S):
        j = i + 1
        while j < len(S):
            if S[i].lower() != S[j].lower():
                break
            j += 1
        if j - 1 == i:
            T += S[i]
        else:
            T += S[i].lower()
        i = j
    return T


S = input()
print(solution(S))
