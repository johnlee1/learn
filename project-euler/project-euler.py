# problem 1
# Find the sum of all the multiples of 3 or 5 below 1000.

def sumDivisibleBy(n):
    i = 999/n
    return n*i*(i+1)/2

print "problem 001: %s" % (sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15))





# problem 2
# By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
# find the sum of the even-valued terms.

def fibonacciEven(n):
    current = 34
    firstPrev = 8
    secondPrev = 2
    total = firstPrev + secondPrev
    while (current < n):
        total += current
        secondPrev = firstPrev
        firstPrev = current
        current = 4*firstPrev + secondPrev
    return total

print "problem 002: %s" % (fibonacciEven(4000000))





# problem 3
# What is the largest prime factor of the number 600851475143?

def largestPrimeFactor(n):
    maxFactor = 2
    while n % 2 == 0:
        n /= d
    d = 3
    while n > 1:
        while n % d == 0:
            maxFactor = d
            n /= d
        d += 2
        if d * d > n:
            if n > 1: maxFactor = n
            break
    return maxFactor

print "problem 003: %s" % (largestPrimeFactor(600851475143))
