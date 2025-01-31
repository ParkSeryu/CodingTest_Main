N = int(input())
result = 0
A = 0
B = 0
C = 0

while A <= N :
    A += 1
    B = 0
    while B <= N :
        B += 1
        C = 0
        while C <= N:
            C += 1
            if A >= B + 2:
                if C % 2 == 0:
                    if A + B + C == N:
                        result += 1

print(result)
