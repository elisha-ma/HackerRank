input = raw_input()

chunks = input.split(":")

if chunks[2][-2:] == "PM":
    if (chunks[0] != "12"):
        chunks[0] = str((int(chunks[0]) + 12) % 24)
else:
    chunks[0] = str((int(chunks[0]) % 12))

if len(chunks[0]) == 1:
    chunks[0] = "0" + chunks[0]

chunks[2] = chunks[2][0:2]

print ":".join(chunks)
