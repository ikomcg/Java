group1 = set()
group2 = set()
self = set()

for i in range(3):
   print("Enter birth month ", i+1 , ": ")  
   group1.add(input())
   
for i in range(3):
   print("Enter birth month ", i+1 , ": ")
   group2.add(input())  

print("Group1: ",group1)
print("group2: ",group2)
print("Enter your birth month: ")
my = input()
self.add(my)
print("Union: ", str(group1 | group2))
print("Intersection: ", str(group1 & group2))
print("Differences: ", str(group1 - group2))

if (group1.__contains__(my)  or group2.__contains__(my)):
    print("You have the same birth month with one of your Classmates")
    
else:
    print("You don't have same birth month in your Classmates")