N = int(raw_input())

cavities = []

for i in range(0, N):
    cavities.append(list(raw_input()))

new_cavities = cavities

for i in range(1, N-1):
    for j in range(1, N-1):
        is_cavity = True
        if cavities[i-1][j] >= cavities[i][j]:
            is_cavity = False
        if is_cavity and cavities[i+1][j] >= cavities[i][j]:
            is_cavity = False

        if is_cavity and cavities[i][j-1] >= cavities[i][j]:
            is_cavity = False
        if is_cavity and cavities[i][j+1] >= cavities[i][j]:
            is_cavity = False

        if is_cavity:
            new_cavities[i][j] = "X"
        
        
    
for i in range(0, N):
    print "".join(new_cavities[i])
            
