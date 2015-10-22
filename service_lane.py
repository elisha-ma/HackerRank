N,T = [int(x) for x in raw_input().split()]

widths = [int(x) for x in raw_input().split()]


def get_vehicle(ij):
    return min(widths[ij[0]:ij[1]+1])


for i in range(0, T):
    print get_vehicle([int(x) for x in raw_input().split()])
