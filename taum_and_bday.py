def calculate_white_black(B, W, X, Y, Z):
    if (Z+X) < Y:
        Y = Z+X
    elif (Z+Y) < X:
        X = Z+Y

    return B * X + W * Y


T = int(raw_input())

for i in range(0, T):
    B,W = [int(x) for x in raw_input().split()]
    X, Y, Z = [int(x) for x in raw_input().split()]
    print calculate_white_black(B, W, X, Y, Z)
