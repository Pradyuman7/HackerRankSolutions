// Why Python after so many in Java/C++?
// Well, just for fun :)

T = int(input())

def exp_mod(a, n, p):
    if n == 0:
        return 1
    temp = ((exp_mod(a, n // 2, p)) ** 2) % p
    if n % 2 == 0:
        return temp
    else:
        return (temp * a) % p

for t in range(T):
    N = int(input())
    print(exp_mod(2, N, 100000) - 1)
