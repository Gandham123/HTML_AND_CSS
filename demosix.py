# the number of coins 5 rupees and 1 rupee coin required fr the given amount:
a=int((input("Enter your amount required::")))
b=int(a/5)
print("5 :" + str(b))
c=a-(b*5)
if c>0:
    print("1"+":"+str(c))
