N = int(input())

hint = [list(map(int, input().split())) for _ in range(N)]

answer = 0

for a in range(1, 10):
    for b in range(1, 10):
        for c in range(1, 10):
            if(a == b or b == c or c == a ):
                continue

            # 숫자가 정해졌다면
            cnt = 0

            for arr in hint:
                number = arr[0]
                strike = arr[1]
                ball = arr[2]

                # a , b , c 라는 숫자를
                # number하고 비교해서

                # 자리수를 나눠서, strike ball을 측정하는 부분
                strike_count = 0                
                ball_count = 0

                d = int(str(number)[0])
                e = int(str(number)[1])
                f = int(str(number)[2])
                
                if(d == a):
                    strike_count += 1
                elif(d == b or d == c):
                    ball_count += 1
                
                if(e == b):
                    strike_count += 1
                elif(e == a or e == c):
                    ball_count += 1
                
                if(f == c):
                    strike_count += 1
                elif(f == a or f == b):
                    ball_count += 1
            

                if ball == ball_count and strike == strike_count:
                    cnt += 1
            
            if cnt == N:
                answer += 1

print(answer)



