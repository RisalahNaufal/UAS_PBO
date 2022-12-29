class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
    
    def get_name(self):
        return self.name
    
    def get_email(self):
        return self.email

# Open-Closed Principle (OCP)

class UserValidator:
    def validate(self, user):
        if '@' not in user.email:
            raise ValueError('Invalid email address')

# Liskov Substitution Principle (LSP)

class Animal:
    def make_sound(self):
        pass

class Dog(Animal):
    def make_sound(self):
        print('Bark!')

class Cat(Animal):
    def make_sound(self):
        print('Meow!')

def make_animals_sound(animals):
    for animal in animals:
        animal.make_sound()

# Interface Segregation Principle (ISP)

class File:
    def read(self):
        pass
    
    def write(self):
        pass

class TextFile(File):
    def read(self):
        print('Reading text file...')
    
    def write(self):
        print('Writing text file...')

class BinaryFile(File):
    def read(self):
        print('Reading binary file...')
    
    def write(self):
        print('Writing binary file...')

# Dependency Inversion Principle (DIP)

class FileProcessor:
    def __init__(self, file):
        self.file = file
    
    def process(self):
        self.file.read()
        self.file.write()

text_file = TextFile()
file_processor = FileProcessor(text_file)
file_processor.process()
