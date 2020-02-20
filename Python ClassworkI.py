Python 3.7.4 (tags/v3.7.4:e09359112e, Jul  8 2019, 20:34:20) [MSC v.1916 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> def factorial(n):
	if n == 1:
		return 1
	else:
		return n * factorial(n - 1)

	
>>> factorial(8)
40320
>>> def take_step(n):
	if n == 1:
		return "Easy"
	else:
		this_step = "step{" + str(n) + "}"
		previous_steps = take_step(n - 1)
		return this_step + " + " + previous_steps

	
>>> take_step(5)
'step{5} + step{4} + step{3} + step{2} + Easy'
>>> def take_step(n):
	if n == 1:
		return "Easy"
	else:
		this_step = "step{" + str(n) + "}"
		previous_steps = take_step(n - 1)
		return this_step + " to " + previous_steps

	
>>> take_step(5)
'step{5} to step{4} to step{3} to step{2} to Easy'
>>> 
>>> 
>>> 
>>> def fibonacci(n):
	if n == 0 or n == 1:
		return n
	else:
		return fibonacci(n - 1) + finonacci(n - 2)

	
>>> fibonacci(2)
Traceback (most recent call last):
  File "<pyshell#28>", line 1, in <module>
    fibonacci(2)
  File "<pyshell#27>", line 5, in fibonacci
    return fibonacci(n - 1) + finonacci(n - 2)
NameError: name 'finonacci' is not defined
>>> def fibonacci(n):
	if n == 0 or n == 1:
		return n
	else:
		return fibonacci(n - 1) + fibonacci(n - 2)

	
>>> fibonacci(2)
1
>>> fibonacci(5)
5
>>> 
>>> 
>>> 
>>> 
>>> def rev(text):
	if len(text) == 1:
		return text
	else:
		return rev(text[1:]) + text[0]

	
>>> rev('money')
'yenom'
>>> def rev(text):
	if len(text) == 1:
		return text
	else:
		return rev(text[2:]) + text[0]

	
>>> rev('money')
'ynm'
>>> def rev(text):
	if len(text) == 1:
		return text
	else:
		return rev(text[1:]) + text[0]

	
>>> rev('money')
'yenom'
>>> 
