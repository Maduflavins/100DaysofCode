def collectNumber():
    phoneNumber = input("Type your number: ").strip().lower()
    while not phoneNumber.isdigit() and len(phoneNumber) != 11:
        print('Invalid Phone Number')
        phoneNumber = input('Please re-enter phone number: ')          

"""def collectName():
    name = input("Type your name or Q to quit: ").strip().lower()
    while not name.isalpha():
        print('Invalid name entered')
        name = input("Please retype your name or Q to quit: ").strip().lower()
    return name

def store_contacts():
    global contacts
    while True:
        name = collectName()
        if name == 'quit' or name == 'q':
            break
        phoneNumber = collectNumber()
    contacts[name] = phoneNumber
    return contacts

def retrieve_contact():
    while True:
        name = collectName()
        if name == 'quit' or name == 'q':
            break
        try:
            print(name, ":", contacts[name])
        except:
            print('Key does not exist')
            
def main():
    #Create contacts dictionary
    contacts = {}

    #Collect and store contacts in dictionary
    print('STORAGE MODE')
    store_contacts()
    print(contacts)

    print('RETRIEVAL MODE')
    retrieve_contact()

if __name__ == '__main__':
    main()"""

def collect_phone_number():
    phone_number = input("type your number: ").strip()
    while not phone_number.isdigit() or len(phone_number) != 11:
        print('Invalid Phone number')
        phone_number = input("type your number: ").strip()

    return phone_number

def collect_name():
    name = input("type your name[or q to quit]: ").strip().lower()
    while not name.isalpha():
        print('Invalid Name!')
        name = input("type your name[or q to quit]: ").strip().lower()
        
    return name

def store_contacts():
    global contacts

    print('STORAGE MODE')
    
    #create contacts dictinary
    contacts = {}

    while True:
        name = collect_name()
        if name == 'quit' or name == 'q':
            break

        # collect phone number with function
        phone_number = collect_phone_number()
        
        contacts[name] = phone_number

def retrieve_contact():
    print('\nRETRIVAL MODE')
    while True:
        name = collect_name()
        if name == 'quit' or name == 'q':
            break

        try:
            print(name, contacts[name])

        except:
            print('Key does  not exist')

def main():    
    #collect and store contacts in dictionary    
    store_contacts()
    print(f"contacts = {contacts}")

    #helps to retrieve a contact by a given name
    retrieve_contact()

if __name__ == '__main__':
    main()
    
