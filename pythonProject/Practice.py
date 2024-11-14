programs_map = {}
programs_map["BSIT"] = "Bachelor of Science in Information Technology"
programs_map["BSCS"] = "Bachelor of Science in Computer Science"
programs_map["BSIS"] = "Bachelor of Science in Information System"
print("The Keys are" + str(list(programs_map)))
del programs_map["BSIT"]
print("List of all Programs")
for x , y in programs_map.items():
       print(x , y)