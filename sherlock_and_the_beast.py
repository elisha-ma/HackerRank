T = int(raw_input())

def get_decent_number(N):
    if (N < 3):
        return -1

    
    for i in range(0, (N)/5 + 1):
        if (N - 5*i) % 3 == 0:
            return "5" * (N - 5*i) + "3" * (5*i)
    if N % 5 == 0:
        return "3" * N

    return -1
for i in range(0, T):
    N = int(raw_input())

    print get_decent_number(N) 
