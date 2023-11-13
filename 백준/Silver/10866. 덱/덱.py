from collections import deque


def solution(N, command):
    queue = deque()

    for i in command:
        if 'push_front' in i:
            c, su = i.split()
            queue.appendleft(su)
        elif 'push_back' in i:
            c, su = i.split()
            queue.append(su)
        elif 'pop_front' == i:
            if check_len(queue):
                print(queue.popleft())
            else:
                print(-1)
        elif 'pop_back' == i:
            if check_len(queue):
                print(queue.pop())
            else:
                print(-1)
        elif 'size' == i:
            print(len(queue))
        elif 'empty' == i:
            if check_len(queue):
                print(0)
            else:
                print(1)                
        elif 'front' == i:
            if check_len(queue):
                print(queue[0])
            else:
                print(-1)
        elif 'back' == i:
            if check_len(queue):
                print(queue[- 1])
            else:
                print(-1)


def check_len(queue):
    if len(queue) > 0:
        return True
    return False


N = int(input())
command = list(input() for _ in range(N))
solution(N, command)
