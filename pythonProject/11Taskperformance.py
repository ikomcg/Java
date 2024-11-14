import time

print("Hi Welcome to the Department of Health(DOH) chatbot")
print() 
time.sleep(3);
name = input("What is your Name? --> ")
time.sleep(2);
print("Hello "+ name +" My name is Clarissa, How can I help you? ");
y= True;

while y:
    print("Write your Question or Select one Question option below ");
    time.sleep(3);
    print() 
    print("A.COVID-19 BASIC INFORMATION     B. SIGNS, SYMPTOMS, AND TRANSMISSION")
    print("C.PUBLIC HEALTH RESPONSE AND CURRENT SITUATION")
    print() 
    Choose = input("--> ");
    print() 
    time.sleep(2);

    if Choose=="A" or Choose=="a" or Choose=="Covid-19 basic information":
        
         print("Here are COVID-19 BASIC INFORMATION, Write your Question or Choose one Question option below");
         print("A.WHAT ARE CORONAVIRUSES?    B.WHAT IS THE NOVEL CORONAVIRUS");
         print() 
         basicInfo = input("--> ");
         print() 
         time.sleep(2);
         if basicInfo=="A" or basicInfo=="a" or basicInfo=="What are Coronaviruses":
             
             print("   Coronaviruses are a large family of viruses causing a range of illnesses,");
             print("from the common cold to more serious infections such as those caused by Middle");
             print("East Respiratory Syndrome-related Coronavirus (MERS-CoV) and Severe Acute");
             print("Respiratory Syndrome-related Coronavirus (SARS-CoV).  Coronavirus can also");
             print("in farm animals and domesticated pets.");
             
         elif basicInfo=="B" or basicInfo=="b" or basicInfo=="What is the novel coronavirus":
             
             print("    The novel coronavirus is a new strain of coronavirus that has not been previously");
             print("identified in humans. The novel coronavirus has caused severe neumonia in several");
             print("cases in China and has been exported to a range of countries  and cities.");
             
             
    elif Choose=="B" or Choose=="b" or Choose=="Signs Systoms and transmission":
         
         print("Here are you need to know about SIGNS, SYMPTOMS, AND TRANSMISSION, Write your Question or Choose one Question option below");
        
         print("A.HOW DOES COVID-19 SPREAD?        B.IS IT SAFE TO RECEIVE PACKAGES FROM CHINA?")
         print("C.IS COVID-19 THE SAME WITH SEVERE ACUTE RESPIRATORY SYNDROME (SARS)?")  
         print() 
         SST = input("--> ")
         print() 
         time.sleep(2);
         if SST=="A" or SST=="a" or SST=="How does covid-19 spread?":
          
             print("    COVID-19 is transmitted from person to person via droplets, contact, and fomites.");
             print("It is transmitted when one individual talks, sneezes, or coughs producing droplets of");
             print("saliva containing the COVID-19 virus.");
         elif SST=="B" or SST=="b" or SST=="Is it safe to receive packages from china":
             
             print("Yes, it is. From what we know about the coronaviruses so far, they do not survive long on objects,");
             print("such as packages and letters. As such, receiving packages from China does not pose risk of contracting the virus to the recipient.");
         else:
             
             print("No. The COVID-19 virus and the SARS-CoV are both coronaviruses and are genetically related to each other,");
             print("SARS is more fatal and deadly but less infectious than COVID-19.");
    else:
         print("What information you want to ask or choose one Question option below");
         print("A.WHERE CAN THE PUBLIC GET INFORMATION ABOUT COVID-19?       B.HAT ARE THE DOH AND OTHER CONCERNED AGENCIES DOING TO CONTAIN THE SITUATION?")
         print() 
         ask = input("--> ");
         print()
         time.sleep(2);
         if ask=="A" or ask=="a" or ask=="Where can the public get information about covid-19":
             
             print("The public can get information about the 2019-nCoV from the DOH's official press releases, website, ");
             print("and official social media platforms. Please be wary of fake news and reports circulating online ");
             print("and always verify the sources of your information.");
         else:
             
             print("DOH is closely monitoring individuals who manifested signs of respiratory infection and had a ");
             print("history of travel to China or other countries with confirmed COVID-19 cases,and is coordinating");
             print(" WHO and China Center for Disease Control for updates.");
     
             
    time.sleep(5);
    print()                
    print("Thank you "+ name +" for your time! Have a great day ")
    again = input("You want to ask us again--> ")
    if again == "yes" or again == "YES":
        continue;
    else:
        print("Ok, again thank you "+ name +" for your time");
        y = False;

    
        
