T = int(raw_input())

def calculate_growth(cycles):
    height = 1
    for i in range(0, cycles):
        if i % 2 == 0:
            height *= 2
        else:
            height += 1

    return height


for i in range(0, T):
    print calculate_growth(int(raw_input()))


