from math import sqrt, floor, ceil

T = int(raw_input())

def count_squares(start, end):

    return int(end - start) + 1

for i in range(0, T):
    input = raw_input().split()
    print count_squares(ceil(sqrt(int(input[0]))), floor(sqrt(int(input[1]))))
