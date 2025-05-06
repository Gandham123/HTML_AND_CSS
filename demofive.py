a=int(input("Enter your number of units consumed in a month::"))
b=c=d=e=f=g=t0=t1=0
if a>0 and a<=50:
    print((a*2)*0.2 + a*2)
if a>=51:
    b=50*2
    c=a-50
    # 3 rupees
if (c>0 and c<100) or c>100:
    if c<=100:
        t0=((c*3 +b)*0.2 + (c*3 +b))
        print(t0)
    else:
        d=100*3
        e=c-100 #150 units complete
if (e>0 and e<100) or (e>100):
    if e<=100:
        t1=(e*5+b+d)*0.2 + (e*5+b+d)
        print(t1)
    else:
        f=100*5
        g=e-100 #250 units completed
        t2=g*8
        print((b+d+f+t2)*0.2 +(b+d+f+t2))

   


