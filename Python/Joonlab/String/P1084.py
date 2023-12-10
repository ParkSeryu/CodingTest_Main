A = list(input().split())
hour = 0
minute = 0
for i in A:
    h, m = map(int, i.split(":"))
    minute += m
    if minute >= 60 :
        hour += 1
        minute %= 60
    hour += h
print("%02d:%02d" %(int(hour), int(minute)))

