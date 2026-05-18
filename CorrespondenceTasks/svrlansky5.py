import math

class Kruznice:
    def __init__(self, radius):
        self.radius = radius

    def dejObvod(self):
        return 2 * math.pi * self.radius

    def dejObsah(self):
        return math.pi * (self.radius ** 2)

# ––– Test funkcionalitet –––

ring1 = Kruznice(4)
print(f"Kružnice 1 (r={ring1.radius}):")
print(f" – Obvod: {ring1.dejObvod():.2f}")
print(f" – Obsah: {ring1.dejObsah():.2f}")

print("–" * 20)

ring2 = Kruznice(8.5)
print(f"Kružnice 2 (r={ring2.radius}):")
print(f" – Obvod: {ring2.dejObvod():.2f}")
print(f" – Obsah: {ring2.dejObsah():.2f}")