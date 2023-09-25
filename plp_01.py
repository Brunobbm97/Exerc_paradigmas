# -*- coding: utf-8 -*-
"""PLP-01.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/10P4CIqkfOMQu7xWhrhhWX5T2Ge0kKu3M

Programa 01 - Objetivo: Fazer a leitura de dois números e mostrar a média
"""

def calculo():#Função que calcula a média
  n1 = float(input("Numero 1: "))
  n2 = float(input("Numero 2: "))
  media = (n1+n2)/2
  print("Média : ",media);

calculo();#Chamada da função

def desconto(preco_atual,porcentagem):
  desconto = preco_atual * (porcentagem/100)
  print("Preço Novo : ",(preco_atual-desconto))
preco_atual = float(input("Digite o valor da mercadoria: "))
porcentagem = float(input("Digite a % do desconto: "))
desconto(preco_atual,porcentagem);

def tempo_vida(num_cigarro_dia,num_anos):
  tempo_vida = num_cigarro_dia * 10
  dias_anos = num_anos * 365
  total_min = tempo_vida * dias_anos
  total_hora = total_min / 60
  total_dia = total_hora / 24
  print("Você perdeu: ",total_dia," dias de vida")

num_cigarro_dia = int(input("Digite o número de cigarros fumados por dia: "))
num_anos = float(input("Digite há quantos anos fuma: "))
tempo_vida(num_cigarro_dia,num_anos)

consumo = int(input("Consumo em kWh: "))
tipo = input("Tipo da instalação (R, C ou I): ")
if tipo == "R":
    if consumo <= 500:
        preço = 0.40
    else:
        preço = 0.65
elif tipo == "I":
    if consumo <= 5000:
        preço = 0.55
    else:
        preço = 0.60
elif tipo == "C":
    if consumo <= 1000:
        preço = 0.55
    else:
        preço = 0.60
else:
    preço = 0
    print("Erro ! Tipo de instalação desconhecido!")
custo = consumo * preço
print(f"Valor a pagar: R$ {custo:7.2f}")

salário = float(input("Digite seu salário: "))
pc_aumento = 0.15
if salário > 1250:
    pc_aumento = 0.10
aumento = salário * pc_aumento
print(f"Seu aumento será de: R$ {aumento:7.2f}")
print(f"o percentual de aumento foi: {pc_aumento:7.2f}")

depósito = float(input("Depósito inicial: "))
taxa = float(input("Taxa de juros (Ex.: 3 para 3%): "))
investimento = float(input("Depósito mensal: "))
mês = 1
saldo = depósito
while mês <= 24:
    saldo = saldo + (saldo * (taxa / 100)) + investimento
    print(f"Saldo do mês {mês} é de R${saldo:5.2f}.")
    mês = mês + 1
print(f"O ganho obtido com os juros foi de R${saldo-depósito:8.2f}.")

