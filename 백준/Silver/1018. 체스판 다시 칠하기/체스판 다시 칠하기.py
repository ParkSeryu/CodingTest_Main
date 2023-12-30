import sys

N, M = map(int, input().split())

chessBoard = [list(map(str, sys.stdin.readline())) for _ in range(N)]

answer = []

diffN = N - 8
diffM = M - 8


def brute_force(chessBoard):
    countW = 0
    countB = 0
    for i in range(0, 8):
        for j in range(0, 8):
            if (i+j) % 2 == 0:
                if chessBoard[i][j] != 'W': countW += 1
                if chessBoard[i][j] != 'B': countB += 1
            else:
                if chessBoard[i][j] != 'B': countW += 1
                if chessBoard[i][j] != 'W': countB += 1
    answer.append(countW)
    answer.append(countB)



chessBoards = [[0] * 8 for _ in range(8)]

for i in range(0, diffN + 1):
    for j in range(0, diffM + 1):
        a = 0
        b = 0
        for k in range(i, i + 8):
            for l in range(j, j + 8):
                # print(a, b, k, l)
                chessBoards[a][b] = chessBoard[k][l]
                b += 1
            a += 1
            b = 0
        brute_force(chessBoards)

print(min(answer))
