n = int(raw_input())   #faster than n = input() , since input() executes the line as python command
for i in range(0,n):
    input_list = raw_input().split()
    num_list = [long(x) for x in input_list]
    res = sum(num_list)
    print res
