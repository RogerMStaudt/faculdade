numero1 = int(input("Digite um numero: "))
numero2 = int(input("Digite outro numero: "))

if numero1 == 0:
    print("Não é possível dividir um número por 0.")
else:
    print("O resultado de " + str(numero1) + " / " + str(numero2) + " é igual a " + str(numero1 / numero2))