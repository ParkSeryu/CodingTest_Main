def solution(board, r, c):
    direction = [[-1, 0], [1, 0], [0, -1], [0, 1]]
    for i in range(len(direction)):
        for j in range(len(direction)):
            for k in range(len(direction)):
                answer = 0
                loc = [r, c]
                iloc = [r + direction[i][0], c + direction[i][1]]
                answer += move_board(board, iloc)
                if in_range(board, loc, iloc):
                    jloc = [iloc[0] + direction[j][0], iloc[1] + direction[j][1]]
                    answer += move_board(board, jloc)
                    if in_range(board, iloc, jloc):
                        kloc = [jloc[0] + direction[k][0], jloc[1] + direction[k][1]]
                        answer += move_board(board, jloc)
                        if in_range(board, jloc, kloc):
                            answer += move_board(board, kloc)
                            if answer >= 2:
                                return 1
    return 0


def in_range(board, loc, lloc):
    if 0 <= lloc[0] <= 4 and 0 <= lloc[1] <= 4 and board[lloc[0]][lloc[1]] != -1 and loc != lloc:
        return True
    return False

def move_board(board, loc):
    if board[loc[0]][loc[1]] == 1:
        return 1
    return 0


board = list(list(map(int, input().split())) for _ in range(5))
r, c = map(int, input().split())
print(solution(board, r, c))
