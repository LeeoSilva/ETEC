@echo off
cls

echo "----------------------------------"
echo "Super Backup according to Arnaldo"
echo "----------------------------------"

FOR /F "tokens=1,2,3 delims=/ " %%a in ("%date%") do (
	set day=%%a
	set month=%%b
	set year=%%c
)

FOR /F "tokens=1,2,3 delims=:, " %%a in ("%time%") do (
	set hour=%%a
	set minute=%%b
	set sec=%%c
)

set day=%year%-%month%-%day%
set hour=%hour%H%minute%m%sec%s

cls
xcopy C:\Users\%username%\Documents F:\Backups\backup-%day%-%hour% /F /-Y /s
pause
cls
