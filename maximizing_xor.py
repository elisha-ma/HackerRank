#!/bin/python

# Complete the function below.


def  maxXor( l,  r):
    lbin = bin(l)[2:]
    rbin = bin(r)[2:]
    
    rlen = len(rbin)
    llen = len(lbin)

    length = 0
    if rlen != llen:
        length = rlen

    else:
        for i in range(0, rlen):
            if (lbin[i] != rbin[i]):
                length = rlen - i
                break

    if length == 0:
        return 0
    return make_binary(length)

def make_binary(length):
    return int("0b" + "1"*length, 2)
    
    

_l = int(raw_input());


_r = int(raw_input());

res = maxXor(_l, _r);
print(res)


