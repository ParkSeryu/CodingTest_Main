from bisect import bisect_right

x = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 10]
p0 = bisect_right(x, 0)
p1 = bisect_right(x, 1)
p2 = bisect_right(x, 2)
p3 = bisect_right(x, 3)
p4 = bisect_right(x, 4)
p5 = bisect_right(x, 5)
p10 = bisect_right(x, 10)
p11 = bisect_right(x, 11)

print(p0, p1, p2, p3, p4, p5, p10, p11)

#0 1 3 6 10 10 11 11