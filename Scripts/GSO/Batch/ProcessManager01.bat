@echo off
cls
echo "SCRIPT.BAT para realizar backup"
pause
cd \document~1\%username%\documentos
copy * d:Arquivos_Backup
pause
echo "Abrir Calculadora"
start calc.exe
pause
