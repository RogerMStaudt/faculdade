numero1 = int(input("Digite um número:\n"))
numero2 = int(input("Digite outro número:\n"))
numero3 = int(input("Digite outro número:\n"))
numero4 = int(input("Digite outro número:\n"))

soma = numero1 + numero2 + numero3 + numero4

if (soma%2 == 0):
    print(str(soma) + " = par")
else:
    print(str(soma) + " = ímpar")