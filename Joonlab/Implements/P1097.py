def solution(board, student):
    answer = 0
    d = [[0, 1], [0, -1], [-1, 0], [1, 0]]  # 상, 하, 좌, 우
    for i in range(len(d)):
        y = student[0] + d[i][0]
        x = student[1] + d[i][1]
        if 0 <= y <= 4 and 0 <= x <= 4:
            if board[y][x] == 1:
                answer = 1
                break
    return answer


board = list(list(map(int, input().split())) for _ in range(5))
student = list(map(int, input().split()))
print(solution(board, student))
