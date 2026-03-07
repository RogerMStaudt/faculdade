
# Exercício 4. Crie um programa que recebe a nota do Grau A e a nota do Grau B pelo teclado e imprime na tela se será necessário 
# ou não realizar o Grau C (considere o sistema de avaliação da Unisinos, sendo o GA valendo 30% e o GB valendo 70%). 
# Caso algum valor informado seja negativo, informe uma mensagem de erro e não realize o cálculo.

nota_grau_A = int(input("Digite a sua nota do grau A: "))
nota_grau_B = int(input("Digite a sua nota do grau A: "))

def valida_numeros(a, b):
    if a < 0:
        print("O número é inválido!")
        exit()

    if b < 0:
        print("O número é inválido!")
        exit()


def calcula_porcentagem(a, b):
    valida_numeros(nota_grau_A, nota_grau_B)
    
    nota = a + b

    if nota >= 7:
        return "Não é necessário fazer a avaliação C"
    else:
        return "É necessário fazer a avaliação C"


print(calcula_porcentagem(nota_grau_A, nota_grau_B))