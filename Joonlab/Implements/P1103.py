def solution(S):
    T = ''
    i = 0

    while i < len(S):
        if S[i].lower() == 'a':
            j = i + 1
            while j < len(S):
                if S[j].lower() != 'a':
                    break
                j += 1
            if j - 1 == i:
                T += S[i]
            else:
                T += S[i].lower()
            i = j
        else:
            T += S[i]
            i += 1
    return T


S = input()
print(solution(S))
