T = int(raw_input())

def calculate_chocolates(money, price, wrappers):
    base = money/price
    extra_wrappers = base
    while extra_wrappers / wrappers > 0:
        new_wrappers = extra_wrappers / wrappers
        base += new_wrappers
        extra_wrappers = extra_wrappers % wrappers + new_wrappers 
    
    return base


for i in range(0, T):
    (money, price, wrappers) = [int(x) for x in raw_input().split()]
    print calculate_chocolates(money, price, wrappers)
