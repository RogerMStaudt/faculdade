nome = input("Qual o seu nome?\n")
idade = int(input("Qual a sua idade?\n")) 

if (idade >= 18):
    print("Tu é adulto")
elif (idade > 13):
    print("Tu é adolescente")
elif (idade >= 0):
    print("Tu é guri(a)")
else:
    print("Idade inválida")