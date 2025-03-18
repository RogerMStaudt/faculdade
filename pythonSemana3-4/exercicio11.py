# Exercício 11. Utilizando while, crie um programa que solicita para o usuário que ele digite 10 valores inteiros. 
# Ao final, imprima a soma de todos os valores digitados.

lista_numeros = []

def soma_numeros():
    for i in range(1, 11):
        lista_numeros.append(int(input("Digite um número: ")))

    return "A soma dos números é: " + str(sum(lista_numeros))

print(soma_numeros())