T = int(raw_input())

for i in range(0, T):
    N = int(raw_input())
    array = [int(x) for x in raw_input().split()]
    xor = 0
    if N % 2 != 0:
        xor = 0
        for j in range(0, N, 2):
	    xor ^= array[j]

    print xor
