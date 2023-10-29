N = input()
t = ""
for i in range(len(N)):
    t += N[i]
    if len(t) % 10 == 0:
        print(t)
        t = ""
print(t)