def PriorityQueue():
 p = PriorityQueue()
print("Enter 4 Names of your classmates:")

for i in range(4):
nickname = input()
p.put (nickname)

while not p.empty():
     Hi = input("Press H to say Hi")
if Hi == "h":
     next = p.get()
print ("Hi" + next)