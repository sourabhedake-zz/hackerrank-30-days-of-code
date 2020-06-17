# Enter your code here. Read input from STDIN. Print output to STDOUT

num = int(input())

for i in range(num):
    inp = input()
    for i in range(0, len(inp), 2):
        print (inp[i], end = "")

    print (" ", end = "")

    for i in range(1, len(inp), 2):
        print (inp[i], end = "")

    print ("")
