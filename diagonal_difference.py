n = int(raw_input())   #faster than n = input() , since input() executes the line as python command
matrix = []
for i in range(0,n):
    input_list = raw_input().split()
    num_list = [int(x) for x in input_list]
    matrix.append( num_list )
    
diag1,diag2 = 0,0
for i in range (0, n):
    diag1 += matrix[i][i]
    diag2 += matrix[i][n-i-1]

print abs(diag1-diag2)
