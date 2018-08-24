#!/bin/bash

# 1) Certifique-se que você está localizdo no seu diretório home
# e crie a estrutura de diretórios.
#
# sor{
# 	bimestre1
# 	bimestre2
# }
#
# poo{
# 	bimestre1
# 	bimestre2
# }

cd ~
mkdir sor/bimestre1
mkdir sor/bimestre2
#------------------
mkdir poo/bimestre1
mkdir poo/bimestre2


# 2) Acesse o diretório sor/bimestre1 e, usando o editor de texto gedit,
# crie o arquivo counteudo1bim com o seguinte texto:

# Conteúdo abordados nas aulas: sistemas operacionais, comandos básicos
# do Linux Ubuntu

cd ~/sor/bimestre1
touch ~/sor/bimestre1/counteudo1bim
vim ~/sor/bimestre1/counteudo1bim

# 3) Acesse o diretório sor/bimestre2/ e usando o editor de
# texto, crie o arquivo hello.c com o seguinte texto:

cd ~/sor/bimestre2
touch hello.c
vim hello.c

# #include <stdio.h>
#
# int main (void){
	# printf("Estou aprendendo Linux e a Linguagem C\n");
	# return 0;
# }

# 4) Certifique-se que está localizado no diretório /sor/bimestre2/.
# compile o arquivo hello.c que você criou previamente.

cd ~/sor/bimestre2
gcc hello.c -o executavel

# 5) Certifique-se que está localizado no diretório /sor/bimestre2
# Execute o programa executável que foi compilado previamente
# a partir do arquivo hello.c.

cd ~/sor/bimestre2
./executavel

# 6) Considerando a estrutura de diretórios criada na questão 1,
# copie o arquivo /sor/bimestre1/counteudo1bim para o diretorio
# /poo/bimestre1, e copie o arquivo /sor/bimestre2/hello.c
# para o diretório /poo/bimestre2

cp ~/sor/bimestre1/counteudo1bim ~/poo/bimestre1
cp ~/sor/bimestre2/hello.c ~/poo/bimestre2

# 7) Certifique-se quer você está loalizado no seu diretorio home
# digite os comandos a seguir e explique, para cada um deles,
# os resultados mostrados na tela

cd ~
ls -R sor/
ls -R /sor poo/

# ======================================


# Resposta: lista o conteudo de todos os diretórios recursivelmente

# 8) Que comando você poderia usar para gravar a estrutura
# de árvores que você criou na questão 1 em um arquivo,
# chamado minhaestrutura

ls > minhaestrutura.txt

# ======================================

# 9) Um comando útil chamado grep, é usado tipicamente para
# localizar um fragmento de texto dentro de arquivos
# localizados no sistema de arquivos do computador.
# Vamos testar o grep?
# Certifique-se que você está localizado
# no seu diretório home, e digite o comando a seguir:

cd ~
grep -r "printf" sor/

# Considerando o resultado mostrado na tela, pergunte-se
# A) Que operação que esse comando utilizou?

# Mostrou em modo recursivo os arquivos do diretório '/sor'
# que contem a string "printf" em seu conteúdo.

# =====================================

# B) O comando contém as seguintes opções:
# -r, "printf" e sor/. O que significa cada uma dessas opções
#  do comando grep?

# '-r' lê todos os arquivos sob cada diretório, recursivamente,
# seguindo links simbólicos apenas se eles estão na linha de comando
# Note que o operante do arquivo é dado, grep procura o diretório
# funcionando. o que é equivalente a função recursiva '-d'

# ====================================

# 10) Que comando pode ser usado para direcionar a lista do
# últimos 10 comandos do seu histórico de comandos do shell
# os comandos do shell para o arquivos chamado meusultimoscomandos?

history 10 > meusultimoscomandos
