def find_deletions(input):
    deletions = 0
    for i in range(1, len(input)):
        if (input[i] == input[i-1]):
            deletions += 1

    return deletions


N = int(raw_input())

for x in range(0, N):
    print find_deletions(raw_input())
