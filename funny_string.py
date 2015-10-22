T = int(raw_input())

def determine_funny(S):
    length = len(S)
    for i in range(0, length-1):
        if (abs(ord(S[i]) - ord(S[i+1])) != abs(ord(S[length-1-i]) - ord(S[length-2-i]))):
            return "Not Funny"

    return "Funny"


for i in range(0, T):
    print determine_funny(raw_input()) 
