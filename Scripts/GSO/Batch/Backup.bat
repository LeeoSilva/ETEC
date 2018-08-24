@echo off
cls
echo ------
echo Backup
echo ------

REM copy the User personal documents to the flashdrive.
xcopy C:\Users\%username%\Documents E:\Backup\Documents
REM Pause the script
pause
cls
