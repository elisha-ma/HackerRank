
def calculate_fine(actual, expected):
    if (int(actual[2]) > int(expected[2])):
        return 10000
    elif int(actual[2]) < int (expected[2]):
        return 0

    if (int(actual[1]) > int(expected[1])):
        return 500 * (int(actual[1]) - int(expected[1]))
    elif int(actual[1]) < int (expected[1]):
        return 0

    if (int(actual[0]) > int(expected[0])):
        return 15 * (int(actual[0]) - int(expected[0]))

    return 0

actual = raw_input().split()
expected = raw_input().split()

print calculate_fine(actual, expected)
    

