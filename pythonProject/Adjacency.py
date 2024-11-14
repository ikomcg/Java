adjlist = []
undigraph = ['a','b','c','d','e','f']
      
adjlist[1]= "b"
adjlist[1]= "a"
adjlist[1]= "c"
adjlist[2]= "d"
adjlist[2]= "e"
adjlist[3]= "c"
adjlist[3]= "e"
adjlist[3]= "f"
adjlist[3]= "g"
adjlist[4]= "c"
adjlist[4]= "d"
adjlist[4]= "f"
adjlist[5]= "d"
adjlist[5]= "e"
adjlist[6]= "d"

for i in range(7):
    print(undigraph(i) + "-->" + adjlist(i))