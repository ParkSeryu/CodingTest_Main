sen = input()
answer = ''
for i in sen:
    if i.isupper():
        answer += i.lower()
    else:
        answer += i.upper()
print(answer)
