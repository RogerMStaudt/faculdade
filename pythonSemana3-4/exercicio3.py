ano = int(input("Digite um ano: "))

if ano%4 != 0:
    print("O ano de " + str(ano) + " não é bissexto")
else:
    print("O ano de " + str(ano) + " é bissexto")