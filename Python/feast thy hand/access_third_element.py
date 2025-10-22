def access_third_element(number):
 
    if len(number) < 3:
        print(" needs at least 3 elements")
        return
    

    for count in range(len(number)):
     
        if count == 2:
            print("The third element is:", number[count])
            break  


number = [10, 20, 30, 40, 50]


access_third_element(number)