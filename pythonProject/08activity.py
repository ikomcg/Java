#Create an empty hash map named programs that will handle keys and values that are both of String type
programs = {}

#Map the following pairs:
programs ["BSIT"] = "Bachelor of Science in Information technology"
programs ["BSCS"] = "Bachelor of Science in Computer Science"
programs ["BSIS"] = "Bachelor of Science in Information System"

#Display the keys in a single line.
print("The keys are: " + str(list (programs)))

#Delete the first entry.
del programs ["BSIT"]

#Check whether the map contains the key "BSCpE".
print("BSCpE " in programs)