N, K = [int(x) for x in raw_input().split()]

C = [int(x) for x in raw_input().split()]

C.sort()

i = 1
sum = 0
k = 0

for x in range(N - 1, -1, -1):
    sum += (C[x] * i)
    k+=1
    if (k == K):
        k = 0
        i+=1

print sum
     
