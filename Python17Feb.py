Python 3.7.4 (tags/v3.7.4:e09359112e, Jul  8 2019, 20:34:20) [MSC v.1916 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> element = 'money'
>>> b = element[::-1]
>>> b
'yenom'
>>> element = 'Ameican Spy in the woods'
>>> b = element[::-1]
>>> b
'sdoow eht ni ypS naciemA'
>>> name = 'Gideon'
>>> a = name.upper([2])
Traceback (most recent call last):
  File "<pyshell#7>", line 1, in <module>
    a = name.upper([2])
TypeError: upper() takes no arguments (1 given)
>>> a = name[2]
>>> a
'd'
>>> a = a.upper()
>>> a
'D'
>>> a
'D'
>>> b = name[3:]
>>> b
'eon'
>>> b + a
'eonD'
>>> c = name[0:2]
>>> c
'Gi'
>>> c.lower()
'gi'
>>> c = c.lower()
>>> c
'gi'
>>> a + b + c
'Deongi'
>>> def nameChange(name):
	a = name[2]
	a = a.upper()
	b = name[3:]
	c = name[0:2].lower()

	
>>> nameChange(Gideon)
Traceback (most recent call last):
  File "<pyshell#28>", line 1, in <module>
    nameChange(Gideon)
NameError: name 'Gideon' is not defined
>>> def nameChange(name):
	a = name[2]
	a = a.upper()
	b = name[3:]
	c = name[0:2].lower()
	return a + b + c

>>> nameChange(Gideon)
Traceback (most recent call last):
  File "<pyshell#32>", line 1, in <module>
    nameChange(Gideon)
NameError: name 'Gideon' is not defined
>>> def compareWords(word1, word2):
    word1 = sorted(word1)
    word2 = sorted(word2)

    if word1 == word2:
        print("The word is anagram")
    else:
        print("word is not an anagram")

        
>>> compareWords(credit, direct)
Traceback (most recent call last):
  File "<pyshell#35>", line 1, in <module>
    compareWords(credit, direct)
NameError: name 'credit' is not defined
>>> a = credit
Traceback (most recent call last):
  File "<pyshell#36>", line 1, in <module>
    a = credit
NameError: name 'credit' is not defined
>>> a = 'credit'
>>> b = 'direct'
>>> compareWords(a, b)
The word is anagram
>>> x = 'tega'
>>> y = 'gate'
>>> compareWords(x, y)
The word is anagram
>>> def nameChange(name):
	a = name[2]
	a = a.upper()
	b = name[3:]
	c = name[0:2].lower()
	return a + b + c

>>> nameChange('Gideon')
'Deongi'
>>> nameChange('Maduabuchi')
'Duabuchima'
>>> nameChange('Tolulope')
'Lulopeto'
>>> aTuple = 11, 12, 13
>>> aTuple
(11, 12, 13)
>>> nameChange("Oluwaseyifunmi")
'Uwaseyifunmiol'
>>> myList
Traceback (most recent call last):
  File "<pyshell#51>", line 1, in <module>
    myList
NameError: name 'myList' is not defined
>>> myList = [1, 2, 3, 4, 5, 6, 7, 8, 9]
>>> print(n for n in myList)
<generator object <genexpr> at 0x00000267D9C8F9C8>
>>> print(n for n in [myList])
<generator object <genexpr> at 0x00000267D9C8F9C8>
>>> print([n for n in myList])
[1, 2, 3, 4, 5, 6, 7, 8, 9]
>>> a = [n for n in myList]
>>> a
[1, 2, 3, 4, 5, 6, 7, 8, 9]
>>> b = [n**2 for n in myList]
>>> b
[1, 4, 9, 16, 25, 36, 49, 64, 81]
>>> print([x+y for x in a for y in b])
[2, 5, 10, 17, 26, 37, 50, 65, 82, 3, 6, 11, 18, 27, 38, 51, 66, 83, 4, 7, 12, 19, 28, 39, 52, 67, 84, 5, 8, 13, 20, 29, 40, 53, 68, 85, 6, 9, 14, 21, 30, 41, 54, 69, 86, 7, 10, 15, 22, 31, 42, 55, 70, 87, 8, 11, 16, 23, 32, 43, 56, 71, 88, 9, 12, 17, 24, 33, 44, 57, 72, 89, 10, 13, 18, 25, 34, 45, 58, 73, 90]
>>> a
[1, 2, 3, 4, 5, 6, 7, 8, 9]
>>> a.extend()
Traceback (most recent call last):
  File "<pyshell#62>", line 1, in <module>
    a.extend()
TypeError: extend() takes exactly one argument (0 given)
>>> a.extend([3])
>>> a
[1, 2, 3, 4, 5, 6, 7, 8, 9, 3]
>>> 
