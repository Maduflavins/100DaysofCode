word = str(input("Enter any long word: "))
word_extra = len(word)
#print(word[2])

#print(word_extra)

for i in range(0, len(word)):
    if i % 3 ==2:
        print (word[i], end='')



