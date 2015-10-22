
def find(V, length, ar):
    lower = 0
    upper = length
    mid = (upper - lower) / 2

    while True:
        if (ar[mid] > V):
            upper = mid
        elif (ar[mid] < V):
            lower = mid
        else:
            return mid

        mid = (upper - lower) / 2 + lower
    
V = int(raw_input())

length = int(raw_input())

ar = [int(x) for x in raw_input().split()]

print find(V, length, ar)
