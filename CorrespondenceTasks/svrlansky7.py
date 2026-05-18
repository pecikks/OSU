# autor Švrlanský Petr (R25096)
class Zakaznik:
    def __init__(self, id: int):
        self.__id = id

    def dejId(self) -> int:
        return self.__id

class Firma(Zakaznik):
    def __init__(self, id: int):
        super().__init__(id)
        self.ico = ""

class Osoba(Zakaznik):
    def __init__(self, id: int):
        super().__init__(id)
        self.jmeno = ""
        self.prijmeni = ""
        self.rodne_cislo = None

class RodneCislo:
    def __init__(self, cislo: str):
        self.__cislo = cislo

    def dejDenNarozeni(self) -> int:
        return int(self.__cislo[4:6])

    def dejMesicNarozeni(self) -> int:
        mesic = int(self.__cislo[2:4])

        if mesic > 50:
            mesic -= 50

        return mesic

    def dejRokNarozeni(self) -> int:
        rok = int (self.__cislo[0:2])

        if rok >= 54:
            return 1900 + rok
        else:
            return 2000 + rok

    def dejPohlavi(self) -> int:
        mesic = int(self.__cislo[2:4])

        if mesic > 50:
            return 1 # žena
        else:
            return 0 # muž

    def jeSpravne(self) -> bool:
        cislo = self.__cislo.replace("/", "")

        if not cislo.isdigit():
            return False

        if len(cislo) !=10:
            return False

        return int(cislo) % 11 == 0

    def dejRodneCislo(self) -> str:
        return self.__cislo

    def zmenRodneCislo(self, rodne_cislo: str):
        self.__cislo = rodne_cislo

    # ------ test funkčnosti ------

osoby = []

rc1 = RodneCislo("045512/1238")
osoba1 = Osoba(1)
osoba1.jmeno = "Jana"
osoba1.prijmeni = "Novakova"
osoba1.rodne_cislo = rc1

rc2 = RodneCislo("020315/5678")
osoba2 = Osoba(2)
osoba2.jmeno = "Petr"
osoba2.prijmeni = "Svoboda"
osoba2.rodne_cislo = rc2

rc3 = RodneCislo("995925/4321")
osoba3 = Osoba(3)
osoba3.jmeno = "Eva"
osoba3.prijmeni = "Dvorakova"
osoba3.rodne_cislo = rc3

osoby = [osoba1, osoba2, osoba3]

print("=" * 45)
print("SEZNAM OSOB")
print("=" * 45)

for osoba in osoby:
    rc = osoba.rodne_cislo

    print(f"ID: {osoba.dejId()}")
    print(f"Jmeno: {osoba.jmeno}")
    print(f"Prijmeni: {osoba.prijmeni}")
    print(f"Rodne c.: {rc.dejRodneCislo()}")
    print(f"Narozeni: {rc.dejDenNarozeni()}.{rc.dejMesicNarozeni()}.{rc.dejRokNarozeni()}")

    if rc.dejPohlavi() == 1:
        print ("Pohlavi: zena")
    else:
        print ("Pohlavi: muz")

    if rc.jeSpravne():
        print("Platnost: spravne")
    else:
        print("Platnost: nespravne")

    print ("–" * 45)
