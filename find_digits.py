T = int(raw_input())

def find_digits(N):

    num_digits = 0
    temp = N

    while (temp > 0):
        digit = temp % 10
        if digit != 0:           
            if N % digit == 0:
                num_digits += 1
        temp /= 10

    return num_digits

for i in range(0, T):
    print find_digits(int(raw_input()))

