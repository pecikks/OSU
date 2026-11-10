class ElektrickySpotrebic:
    def __init__(self, napeti: float):
        self._napeti = napeti

    def dejNapeti(self) -> float:
        return self._napeti

    def zmenNapeti(self, napeti: float) -> None:
        self._napeti = napeti


class ZdrojSvetla:
    def __init__(self, svitivost: float):
        self._svitivost = svitivost

    def dejSvitivost(self) -> float:
        return self._svitivost

    def zmenSvitivost(self, svitivost: float) -> None:
        self._svitivost = svitivost


class ZdrojTepla:
    def __init__(self, teplo: float):
        self._teplo = teplo

    def dejTeplo(self) -> float:
        return self._teplo

    def zmenTeplo(self, teplo: float) -> None:
        self._teplo = teplo


class Zarovka(ElektrickySpotrebic, ZdrojSvetla, ZdrojTepla):
    def __init__(self, typ: str, napeti: float, svitivost: float, teplo: float):
        ElektrickySpotrebic.__init__(self, napeti)
        ZdrojSvetla.__init__(self, svitivost)
        ZdrojTepla.__init__(self, teplo)
        self.typ = typ

# ----- test funkcionalit ------

zarovka = Zarovka("LED", 230.0, 806.0, 35.0)

print(f"Typ: {zarovka.typ}")
print(f"Napeti: {zarovka.dejNapeti()} V")
print(f"Svitivost: {zarovka.dejSvitivost()} lm")
print(f"Teplo: {zarovka.dejTeplo()} C")

zarovka.zmenNapeti(220.0)
zarovka.zmenSvitivost(900.0)
zarovka.zmenTeplo(40.0)

print("Po zmene:")
print(f"Napeti: {zarovka.dejNapeti()} V")
print(f"Svitivost: {zarovka.dejSvitivost()} lm")
print(f"Teplo: {zarovka.dejTeplo()} C")
