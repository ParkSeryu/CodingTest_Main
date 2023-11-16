def solution(S):
    for s in S:
        print(isPalindrome(s), count)


def recursion(s, l, r):
    global count
    count += 1
    if l >= r: return 1
    elif s[l] != s[r]: return 0
    else: return recursion(s, l+1, r-1)


def isPalindrome(s):
    global count
    count = 0
    return recursion(s, 0, len(s) - 1)

T = int(input())
S = list(input() for i in range(T))
count = 0
solution(S)
