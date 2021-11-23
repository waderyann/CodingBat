x = "123456789"
y = ["Joe", 3, True]
#Prints every number from 0-392
for x in range(392):
    print(x)

    #If this loop contians the value 391
    if x == 394:
        
        #Loops the printed word 4 times
        for x in range(4):
            print("YUPPP")
    else:
        #Int to String
        print("Doesn't contain " + str(x))
        x = x - 20
        print("New Value of X is " + str(x))

#Prints the Array Values
for i in y:
    print(i)
