from PIL import Image
import numpy as np

print("ZAD 2")
print("")

inicjaly = Image.open("inicjaly.bmp")
inicjaly.show()
print("INFORMACJE O OBRAZIE")
print("")
print("tryb:", inicjaly.mode)
print("format:", inicjaly.format)
print("rozmiar:", inicjaly.size)

print("ZAD 3")
print("")

dane_ini = np.asarray(inicjaly)
dane_ini1 = dane_ini * 1


inicjaly = open("inicjaly.txt", 'w')
for rows in dane_ini1:
    for item in rows:
        inicjaly.write(str(item) + ' ')
    inicjaly.write('\n')
print(dane_ini1)

print("ZAD 4")
print("")
print("Typ danych tablicy: ", dane_ini1.dtype)
print("Rozmiar tablicy", dane_ini1.shape)
print("Liczba elementow tablicy", dane_ini1.ndim)
print("Wymiar tablicy", dane_ini1.ndim)
print("Rozmiar wyrazu tablicy", dane_ini1.dtype)






