#!/bin/python

q = int(raw_input().strip())

for x in xrange(q):
    
    n = int(raw_input().strip())
    m = []
    rowsum = [0]*n
    colsum = [0]*n
    
    for i in xrange(n):
        m.append(map(int,raw_input().strip().split(' ')))
        rowsum[i] = sum(m[-1])
        colsum = map(lambda a, b: a+b, colsum, m[-1])
        
    rowsum.sort()
    colsum.sort()
    
    if rowsum == colsum:
        print 'Possible'
    else:
        print 'Impossible'
