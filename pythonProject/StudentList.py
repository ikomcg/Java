students = {}

for i in range(3):
    print("Enter student Number " , i+1 , ": ");
    num = input()
    print("Enter first name " , i+1 , ": ");
    name = input()
    
    students  [num]= name
print("Student List")

for x,y in students.items():
    print(x + " - " + y)

del students [num]
print("Enter your student Number: ")
mynum = input()
print("Enter first name: ")
myname = input()

students [mynum] = myname
for x,y in students.items():
    print(x + " - " + y)
    