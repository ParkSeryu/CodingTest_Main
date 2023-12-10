from bisect import bisect_left

# 정렬을 유지하며 가장 왼쪽 인덱스를 반환하는 이진 탐색 라이브러리
x = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 10]
p0 = bisect_left(x, 0)
p1 = bisect_left(x, 1)
p2 = bisect_left(x, 2)
p3 = bisect_left(x, 3)
p4 = bisect_left(x, 4)
p5 = bisect_left(x, 5)
p10 = bisect_left(x, 10)
p11 = bisect_left(x, 11)

print(x)
# [1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 10]
