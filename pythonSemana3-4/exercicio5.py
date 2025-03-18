# Exercício 5. Crie um programa que solicita que o usuário digite uma letra e imprime na tela se a letra é uma vogal ou uma consoante.

letra_selecionada = input("Digite uma letra do alfabeto: ")

def valida_caracter():
    if not letra_selecionada.isalpha():
        print("Digite uma letra que pertence ao alfabeto!")
        exit()

    if len(letra_selecionada) > 1:
        print("Digite apenas uma letra!")
        exit()
    

def verifica_letra():
    valida_caracter()

    vogais = ['A', 'E', 'I', 'O', 'U']

    if letra_selecionada.upper() in vogais:
        return "A letra digitada é uma vogal!"
    else:
        return "A letra digitada é uma consoante!"

print(verifica_letra())