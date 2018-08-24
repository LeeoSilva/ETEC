@echo off

:: Yes this looks bad, but it works, it sets the file variable mydate to YYYY_MM_DAY

set mydate=%date:~10,4%_%date:~4,2%_%date:~7,2%
echo Backing up DC1:

:: start a new backup session, the /M switch is for the type of bakcup being performed, type ntbackup /? for more info

start /wait ntbackup backup \\DC1\c$ /j "DC1 Backup" /f "C:\BAK\DC1\DC1_%mydate%.bkf" /M incremental
echo DC1 is Done
echo Backing up EXCH:
start /wait ntbackup backup \\EXCH\c$ /j "EXCH Backup" /f "C:\BAK\EXCH\EXCH_%mydate%.bkf" /M incremental
echo EXCH is Done
echo Backing up FS1:
start /wait ntbackup backup \\FS1\c$ /j "FS1 Backup" /f "C:\BAK\FS1\FS1_%mydate%.bkf" /M incremental
echo FS1 is Done
echo Backup was completed %date% %time%
pause
