num_test_cases = int(raw_input())

for i in range(0, num_test_cases):
    (N, K) = [int (x) for x in raw_input().split()]

    students = [int(x) for x in raw_input().split()]

    num_late = 0

    for j in range(0, N):
        if students[j] > 0:
            num_late += 1
        if num_late > (N-K):
            print "YES"
            break
    else:
        print "NO"
