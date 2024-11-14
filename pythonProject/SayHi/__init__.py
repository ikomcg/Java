from queue import PriorityQueue
p = PriorityQueue()

print("Enter the nicknames of 4 of your classmates: ")
number = [1,2,3,4]
for i in number:
    nickname = input()
    p.put(nickname)
while not p.empty():
        sayHi = input("Press H to say Hi to each them ")
        if sayHi == ("h"):
            next_item = p.get()
            print("Hi "+next_item)
        if p.empty():
            print("Done saying Hi")