def encrypt_caesar(text, shift):
    encrypted_text = ""

    for char in text:
        base_char = ord('a')
        shifted_position = (ord(char) - base_char + shift) % 26 #modulo, aby se necvaklo na konci abecedy
        new_char = chr(shifted_position + base_char)
        encrypted_text += new_char

    return encrypted_text

if __name__ == '__main__':
        original_text = input("Zadejte šifru (pouze malá písmena): ")
        shift_value = int(input("zadejte délku posunutí (číslo): "))

        result = encrypt_caesar(original_text, shift_value)
        print(f"Zakodovaný text: {result}")