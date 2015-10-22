n = int(raw_input())   #faster than n = input() , since input() executes the line as python command
input_list = raw_input().split()

neg, pos, zero = 0.000, 0.000, 0.000
for i in range(0,n):
   if (int(input_list[i]) > 0):
       pos += 1
   elif (int(input_list[i]) < 0):
       neg += 1
   else:
       zero += 1

print "{:0.3f}".format(pos / n)
print "{:0.3f}".format(neg / n)
print "{:0.3f}".format(zero / n)

        
     
