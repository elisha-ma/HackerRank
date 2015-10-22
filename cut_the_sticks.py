N = int(raw_input())

sticks = [int(x) for x in raw_input().split()]

sticks.sort(reverse=True)
while (N > 0):
    print N
    smallest = sticks[N-1]
    for i in range(0, N):
        if (sticks[i] == smallest):
            N = i
            break
        sticks[i] = sticks[i] - smallest
   
