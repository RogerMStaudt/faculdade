# Exercício 14. Utilizando for,crie um programa que imprime a tabuada de um número inteiro digitado pelo usuário.

numero_digitado = int(input("Digite um número: "))

print("A tabuada do " + str(numero_digitado) + " é:")

for i in range(1, 11):
    print(i * numero_digitado)