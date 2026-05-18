class MyClass:
    def __init__(self, value):
        self.set_value(value)

    def set_value(self, value):
        if (value > 0):
            self.__value = value
        else:
            self.__value = 0

    def get_value(self):
        return self.__value

myObject = MyClass(1)
print(myObject.get_value())
