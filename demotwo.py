a=input("Enter your String::")
b=len(a)-4
c=a[0:2]+"*"*b+a[b+2:]
print(c)