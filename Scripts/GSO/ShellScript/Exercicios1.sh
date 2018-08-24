#!/bin/bash

#1) Cancelar a sessão atual e iniciar uma nova sessão.

logout
login

#2)Abrir o manual do comando top.
# A propósito, o que mostra o comando top?

man top

# Resposta: Mostra os processos em execução.

#3) No seu diretório home, escreva os comandos para criar os
# diretórios atividade1 e atividade2

mkdir /home/$USER/atividade1
mkdir /home/$USER/atividade2

#4) No seu diretório home, liste o conteúdo do diretório.

ls /home/$USER

#5) Entre no diretório atividade1 e mostre o caminho do
# diretório corrente.

cd /home/$USER/atividade1
pwd

#6) Crie o arquivo trabalho1.txt dentro do diretório atividade1,
# e o arquivo trabalho2.txt dentro do diretório atividade2.

touch /home/$USER/atividade1/trabalho1.txt
touch /home/$USER/atividade2/trabalho2.txt

#7) Copie o arquivo trabalho1.txt para atividade2

cp /home/$USER/atividade1/trabalho1.txt /home/$USER/atividade2

#8) Limpe o terminal

clear

#9) Mostre a data atual do sistema

date

#10) Veja todas as informações sobre seu SO, e salve-as
# em um arquivo.

uname > Info.txt

#End of the file.
