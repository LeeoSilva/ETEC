#!bin/bash

# If the script is running without root permissions
# Enter root.
checkRoot = id -u $USER
if [ checkRoot == "1000" ]
	then
		sudo su
else
	echo "The Script cannot be executed without root access"
	sleep 2
	exit
fi



$currentPath='pwd' # Current path of the file

cd $currentPath
cd ..
cd ..
cd /Features
cat hosts >> /etc/hosts
