import sys
import random

ans = True

while ans:
    question = raw_input("Ask the Magic 8 Ball your question: ")
    
    answers = random.randint(1,8)
    
    if question == "":
        sys.exit()
    
    elif answers == 1:
        print "It is for sure."
    
    elif answers == 2:
        print "Sorry, ask again later."

    elif answers == 3:
        print "Does not look good."
    
    elif answers == 4:
        print "My reply is no."
    
    elif answers == 5:
        print "Of course!"
    
    elif answers == 6:
        print "Are you serious?"
    
    elif answers == 7:
        print "There is a 50/50 shot."
    
    elif answers == 8:
        print "If you believe hard enough."
