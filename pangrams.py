sentence = raw_input().lower()

letters = {}
for i in range(0, len(sentence)):
    if (ord(sentence[i]) >=97 and ord(sentence[i]) <= 122):
        letters[sentence[i]] = 1


if (len(letters.keys()) == 26):
    print "pangram"
else:
    print "not pangram"


