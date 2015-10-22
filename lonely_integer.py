N = int(raw_input())

input = [int(x) for x in raw_input().split()]

lonely_tracker = {}
total_tracker = {}

for i in input:
    if i in lonely_tracker:
        del lonely_tracker[i]
    else:
        if not i in total_tracker:
            lonely_tracker[i] = 1
    total_tracker[i] = 1


print lonely_tracker.keys()[0]
    
