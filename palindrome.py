name = input("Type string: ")

new_name = ''
for c in name:
    if c != "'" and c != ' ':
        new_name += c
        
new_name = new_name.lower()
print(new_name == new_name[::-1])
