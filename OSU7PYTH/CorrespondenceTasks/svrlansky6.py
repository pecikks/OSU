class Processor:
    def __init__(self, frequency: float, cores: int, series: str):
        self.__frequency = frequency
        self.__cores = cores
        self.__series = series

    def __str__(self):
        return (f"- Řada: {self.__series}\n"
                f"- Počet jader: {self.__cores}\n"
                f"- Frekvence: {self.__frequency} GHz")

class Memory:
    def __init__(self, capacity: float):
        self.__capacity = capacity

    def __str__(self):
        return f"- Kapacita: {self.__capacity} GB"

class HardDisk:
    def __init__(self, capacity: float, rotational_speed: int, average_access_time: int, cache_memory: float):
        self.__capacity = capacity
        self.__rotational_speed = rotational_speed
        self.__average_access_time = average_access_time
        self.__cache_memory = cache_memory

    def __str__(self):
        return (f"- Kapacita: {self.__capacity} GB\n"
                f"- Rychlost otáčení: {self.__rotational_speed} RPM\n"
                f"- Průměrná doba přístupu: {self.__average_access_time} ms\n"
                f"- Vyrovnávací paměť (cache): {self.__cache_memory} MB")

class Computer:
    def __init__(self, cpu: Processor, memory: Memory, hdd: HardDisk):
        self.cpu = cpu
        self.memory = memory
        self.hdd = hdd

    def read_info(self):
        print("=" * 40)
        print("SPECIFIKACE POČÍTAČE")
        print("=" * 40)

        print("\n[PROCESOR (CPU)]")
        print(self.cpu)

        print("\n[PAMĚŤ (RAM)]")
        print(self.memory)

        print("\n[PEVNÝ DISK (HDD)]")
        print(self.hdd)

        print("=" * 40)

# Zkouška
my_processor = Processor(3.5, 8, "AMD Ryzen 7")
my_memory = Memory(16.0)
my_disk = HardDisk(1000.0, 7200, 8, 64.0)

my_PC = Computer(my_processor, my_memory, my_disk)

my_PC.read_info()