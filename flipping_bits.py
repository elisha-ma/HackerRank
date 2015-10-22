T = int(raw_input())

b = 0xFFFFFFFF

for i in range(0, T):
    print int(raw_input()) ^ b
