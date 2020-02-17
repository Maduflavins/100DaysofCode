"""
the list methods

1. Append
2. Pop - takes an index and remove that thing. if you do not pass anything, it removes the last guy
3. reverse is also mutating
4. Insert

Mutable methods dont return anything
Split creates a list out of a string

Python 3.7.4 (tags/v3.7.4:e09359112e, Jul  8 2019, 20:34:20) [MSC v.1916 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> li
Traceback (most recent call last):
  File "<pyshell#0>", line 1, in <module>
    li
NameError: name 'li' is not defined
>>> li = [print, len, 5, "Philemon"]
>>> li.remove(print)
>>> li
[<built-in function len>, 5, 'Philemon']
>>> li.pop(0)
<built-in function len>
>>> li
[5, 'Philemon']
>>> li.append("James")
>>> li
[5, 'Philemon', 'James']
>>> li.insert(1, "Christian")
>>> li
[5, 'Christian', 'Philemon', 'James']
>>> li.insert("Fortune")
Traceback (most recent call last):
  File "<pyshell#10>", line 1, in <module>
    li.insert("Fortune")
TypeError: insert() takes exactly 2 arguments (1 given)
>>> li.insert(0, "Fortune")
>>> li
['Fortune', 5, 'Christian', 'Philemon', 'James']
>>> li.append(1, "Belt")
Traceback (most recent call last):
  File "<pyshell#13>", line 1, in <module>
    li.append(1, "Belt")
TypeError: append() takes exactly one argument (2 given)
>>> james = []
>>> james.append(1, "Belt")
Traceback (most recent call last):
  File "<pyshell#15>", line 1, in <module>
    james.append(1, "Belt")
TypeError: append() takes exactly one argument (2 given)
>>> james.insert(1, "Belt")
>>> james
['Belt']
>>> li
['Fortune', 5, 'Christian', 'Philemon', 'James']
>>> li.pop(3)
'Philemon'
>>> li
['Fortune', 5, 'Christian', 'James']
>>> li.remove('James')
>>> li
['Fortune', 5, 'Christian']
>>> name = 'abu jide'
>>> name.split()
['abu', 'jide']
>>> list(name)
['a', 'b', 'u', ' ', 'j', 'i', 'd', 'e']
>>> string = list.name
Traceback (most recent call last):
  File "<pyshell#26>", line 1, in <module>
    string = list.name
AttributeError: type object 'list' has no attribute 'name'
>>> string = list(name)
>>> string = string.reverse()
>>> string
>>> 
>>> string
>>> list(name)
['a', 'b', 'u', ' ', 'j', 'i', 'd', 'e']
>>> string = string.reverse(name)
Traceback (most recent call last):
  File "<pyshell#33>", line 1, in <module>
    string = string.reverse(name)
AttributeError: 'NoneType' object has no attribute 'reverse'
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 

>>> 


>>> 

>>> 
>>> 
>>> 
>>> 
>>> 
>>> 

>>> 

>>> 


>>> 
>>> 
>>> 
>>> 

>>> 


>>> 

>>> 

>>> 


>>> 
>>> 



>>> 

>>> 


>>> name = 'abu jide'
>>> li = list(name)
>>> li
['a', 'b', 'u', ' ', 'j', 'i', 'd', 'e']
>>> rev_name = ''.join(li)
>>> rev_name
'abu jide'
>>> name
'abu jide'
>>> li = list(name)
>>> li
['a', 'b', 'u', ' ', 'j', 'i', 'd', 'e']
>>> li.reverse()
>>> li
['e', 'd', 'i', 'j', ' ', 'u', 'b', 'a']
>>> rev = ''.join(li)
>>> rev
'edij uba'
>>> rev.reverse()
Traceback (most recent call last):
  File "<pyshell#75>", line 1, in <module>
    rev.reverse()
AttributeError: 'str' object has no attribute 'reverse'
>>> rev = list(rev)
>>> rev
['e', 'd', 'i', 'j', ' ', 'u', 'b', 'a']
>>> rev.reverse()
>>> rev
['a', 'b', 'u', ' ', 'j', 'i', 'd', 'e']
>>> rev = ''.join(li)
>>> rev
'edij uba'
>>> rev_one = rev.reverse()
Traceback (most recent call last):
  File "<pyshell#82>", line 1, in <module>
    rev_one = rev.reverse()
AttributeError: 'str' object has no attribute 'reverse'
>>> rev_one
Traceback (most recent call last):
  File "<pyshell#83>", line 1, in <module>
    rev_one
NameError: name 'rev_one' is not defined
>>> rev = list(rev)
>>> rev
['e', 'd', 'i', 'j', ' ', 'u', 'b', 'a']
>>> rev_one = rev.reverse()
>>> rev_one
>>> print(rev_one)
None
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 
>>> name
'abu jide'
>>> names = list(name)
>>> names
['a', 'b', 'u', ' ', 'j', 'i', 'd', 'e']
>>> names.reverse()
>>> names
['e', 'd', 'i', 'j', ' ', 'u', 'b', 'a']
>>> named = ''.join(li)
>>> named
'edij uba'
>>> namedagain = ','.join(name)
>>> namedagain
'a,b,u, ,j,i,d,e'
>>> rev
['a', 'b', 'u', ' ', 'j', 'i', 'd', 'e']
>>> 
>>> 
>>> 
>>> 
>>> 
>>> 

>>> 


>>> 

>>> 

>>> 


>>> 
>>> 



>>> 

>>> 


>>> 

>>> 


>>> 

>>> 

>>> 


>>> def expand(lis):
	print(lis**2)

	
>>> a = [2, 3]
>>> expand(a)
Traceback (most recent call last):
  File "<pyshell#140>", line 1, in <module>
    expand(a)
  File "<pyshell#138>", line 2, in expand
    print(lis**2)
TypeError: unsupported operand type(s) for ** or pow(): 'list' and 'int'
>>> def expand(lis):
	print(lis*2)

	
>>> a = [2, 3]
>>> expand(a)
[2, 3, 2, 3]
>>> def expand(lis):
	lis.reverse()
	print(lis*2)

	
>>> a = [2, 3]
>>> expand(a)
[3, 2, 3, 2]
>>> a
[3, 2]
>>> expand(a)
[2, 3, 2, 3]
>>> a
[2, 3]
>>>



"""
