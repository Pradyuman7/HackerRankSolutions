#!/bin/python

import sys
import fractions

lines = []
for line in sys.stdin:
    if '#' not in line:
        lines.append(map(int, line.strip().split(' ')))

del lines[0] # get rid of superfluous line count

for coords in lines:
    from_pos = [coords[0], coords[1]]
    to_pos = [coords[2], coords[3]]
    from_gcd = fractions.gcd(from_pos[0], from_pos[1])
    to_gcd = fractions.gcd(to_pos[0], to_pos[1])
    if from_gcd == to_gcd:
        print 'YES'
    else:
        print('NO')
