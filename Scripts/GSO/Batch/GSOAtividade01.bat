REM Desliga o Output do prompt.
REM @ECHO OFF
REM Estrutura de pastas

cls
title Atividade GSO
color a
cd C:\Users\Leonardo\Desktop

REM Verifica se a pasta Atividades Existe
IF EXIST "C:\Users\Leonardo\Desktop\Atividades" (
  del "C:\Users\Leonardo\Desktop\Atividades" /F /Q
)

REM Primeiras Pastas
mkdir Atividades
cd Atividades
mkdir Provas Revisao Trabalhos
cd Revisao
mkdir Banco GSO LTT
cd ../Trabalhos
mkdir Escritos Praticos
cd ..
mkdir Provas
cls
echo "Estrura"
tree /F
pause

REM Criando arquivo de texto.
cd C:\Users\Leonardo\Desktop
start notepad.exe Atividades01.txt
@echo CHDIR (CD) Change Directory Command > Atividades01.txt
@echo Once you have located the directory you want, you may move from directory to directory using the CD command (change directory) >> Atividades01.txt
@echo MKDIR (MD) Make Directory Command >> Atividades01.txt
@echo This command creates a new directory. >> Atividades01.txt
@echo Example: >> Atividades01.txt
@echo •	C> mkdir mine >> Atividades01.txt
@echo •	Creates a directory called 'MINE' >> Atividades01.txt
@echo RMDIR (RD) Remove Directory Command >> Atividades01.txt
@echo This command removes a directory. It is only possible to execute this command if the directory you wish to remove is empty. >> Atividades01.txt
@echo Example: >> Atividades01.txt
@echo •	C> rd mine >> Atividades01.txt
@echo •	Removes directory called 'MINE'.  >> Atividades01.txt
@echo Once you have located the directory you want, you may move from directory to directory using the CD command (change directory) >> Atividades01.txt
@echo MKDIR (MD) Make Directory Command >> Atividades01.txt
@echo This command creates a new directory. >> Atividades01.txt
@echo Example: >> Atividades01.txt
@echo •	C> mkdir mine >> Atividades01.txt
@echo •	Creates a directory called 'MINE' >> Atividades01.txt
@echo RMDIR (RD) Remove Directory Command >> Atividades01.txt
@echo This command removes a directory. It is only possible to execute this command if the directory you wish to remove is empty. >> Atividades01.txt
@echo Example: >> Atividades01.txt
@echo •	C> rd mine >> Atividades01.txt
@echo •	Removes directory called 'MINE'. >> Atividades01.txt
taskkill /IM notepad.exe
REM Pode ocorrer um erro na linha acima. Vai pra lista de pesquisa :)

REM Exercicio 1 && Exercicio 2 && Exercicio 3 && Exercicio 4:
REM 01.	Crie uma cópia deste arquivo chamado atividade01.txt para todas as outras pastas.
REM 02.	Altere o nome do arquivo atividade01.txt que está na pasta BANCO para ativ01.txt
REM 03.	Duplique o arquivo chamado atividade01.txt que está em LTT para atividade02.boy
REM 04.	Liste os arquivos da pasta atividade e suas pastas filhas (utilize o dir e o tree).
cd Atividades
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Revisao\Banco\Ativ01.txt"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Revisao\GSO"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Revisao\LTT"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Trabalhos\Escritos"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Trabalhos\Praticos"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Revisao\LTT\Atividades02.boy"
cls
echo "Exercicios 1, 2 e 3"
tree /F
pause

REM Exercicio 5:
cd C:\Users\Leonardo\Desktop\Atividades\Provas
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades01.doc"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades01.pub"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades02.doc"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades02.out"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades03.esc"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades03.full"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades03.asc"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades04.del"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades03.fui"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades04.aaa"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades04.adsa"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades04.meu"
copy "C:\Users\Leonardo\Desktop\Atividades01.txt" "C:\Users\Leonardo\Desktop\Atividades\Provas\Atividades04.sim"
cls
echo "Exercicio 6"
dir
pause

REM Exercicio 7:
copy "*.txt" "C:\Users\Leonardo\Desktop\Atividades\Revisao\Banco"
cls
echo "Exercicio 7"
tree "C:\Users\Leonardo\Desktop\Atividades\Revisao\Banco"
pause
cls

REM Exercicio 8:
copy "Atividade02.*" "C:\Users\Leonardo\Desktop\Atividades\Trabalhos\Escritos"
cls
echo "Exercicio 8"
tree /F
pause

REM Exercicio 9:
copy "Atividades04.*" "C:\Users\Leonardo\Desktop\Atividades\Trabalhos\Praticos"
cls
echo "Exercicio 9"
tree "C:\Users\Leonardo\Desktop\Atividades\Trabalhos\Praticos"
pause

REM Exercicio 10:
del "Atividades04.meu" /F /Q
echo "Exercicio 10"
dir
pause

REM Exercicio 11:
echo "Exercicio 11"
tree /F "C:\Users\Leonardo\Desktop\Atividades"
pause
cls

REM Exercicio 12:
del "C:\Users\Leonardo\Desktop\Atividades" /F /Q


exit
