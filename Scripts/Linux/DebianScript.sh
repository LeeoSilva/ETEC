#!/bin/sh

# Welcome Begin
function Welcome(){ 
    # Preparing to introduce the menu.
    Install lsb-releases &> /dev/null
	Install wget  &> /dev/null
	Install dialog &> /dev/null
	Install dhcpcd &> /dev/null
    
    # Menu
    clear
    echo -e "${RED}Welcome to ${LBLUE}${Distro}${NC}"
    echo "We need to get some information before starting, Okay?"

    echo "What will be the name of your hostname? "
    read hostname
    hostname=${hostname,,}

    echo "What will be the name of your user?"
    read username
}  
# Welcome End



# checkRoot Begin
function checkRoot(){ 
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
}
# checkRoot End



# CheckInternetConnection Begin
function CheckInternetConnection(){ 
    systemctl start dhcpcd.service &> /dev/null
    wget -q --spider http://google.com
    if [ $? -eq 0 ]; then
        echo "Online"
    else
        echo "Offline"
        read -p "Do you wish to connect to an wifi?[Y/n]: " option
        option=${option^^}
        if [ $option == "Y" ]
            then
                wifi-menu
                CheckInternetConnection
        else
            echo "The Script cannot be executed without internet connection."
            sleep 2
            exit
        fi
    fi 
} 
# CheckInternetConnection End


# Install Begin
function Install(){ 
    # Facilitates the installation of new packages
    if [ $1 == "System" ]
        then
            echo "----------Upgrading the Sistem----------"
			sudo dpkg --add-architecture i386
			sudo apt-get update
			sudo apt-get upgrade
			clear
    else
        echo "----------Installing ${$1}----------"
        yes | apt-get $1
        clear
    fi
}
# Install End



clear
echo "Don't do anything else while this script run. Yes, it will take a while. Be patient."
sleep 5

read -p "Enter your hostname: " hostname
read -p "Enter your username: " username

#Creating Users and defining passwords
echo "Adding $username as new user"
sudo adduser $username
clear

echo "Type your $username user password: "
passwd $username
clear

echo "Type your root password: "
passwd root
clear

#Adding a hostname
sudo echo $hostname > /etc/hostname
echo $hostname added to the hostfile
sleep 0.2
clear

#Upgrading System clock based on hardware clock (BIOS)
#And UTC cordinates
sudo hwclock --systohc
clear

#Adding a ABNT2 keyboard layout
sudo echo "setxkbmap -model pc105 -layout br -variant abnt2" > ~/.bashrc
sudo echo "setxkbmap -model pc105 -layout br -variant abnt2" > /root/.bashrc

#Preparing to begin the installations

Install libappindicator1 &> /dev/null
Install curl &> /dev/null
Install wget &> /dev/null
Instal  apt-transport-https &> /dev/null
Install dirmngr &> /dev/null
Install software-properties-common &> /dev/null
Install python-software-properties &> /dev/null
Install libappindicator1 &> /dev/null
Install curl &> /dev/null
Install wget &> /dev/null
Install apt-transport-https &> /dev/null
Install dirmngr &> /dev/null
Install software-properties-common &> /dev/null
Install python-software-properties &> /dev/null

#Wget'ing necessary packages, keys, etc...
wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | sudo apt-key add -
wget http://kdl1.cache.wps.com/ksodl/download/linux/a21//wps-office_10.1.0.5707~a21_amd64.deb -O wps-office.deb
wget http://kdl.cc.ksosoft.com/wps-community/download/fonts/wps-office-fonts_1.0_all.deb -O web-office-fonts.deb
wget -O discord-canary.deb https://discordapp.com/api/download/canary?platform=linux

#Adding necessary PPA's
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys BBEBDCB318AD50EC6865090613B00F1FD2C19886 0DF731E45CE24F27EEEB1450EFDC8610341D9410

#Adding Things to Sources.list
echo "#Spotify\ndeb http://repository.spotify.com stable non-free" | sudo tee /etc/apt/sources.list.d/spotify.list
sudo sh -c 'echo "# Google Chrome\ndeb http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list'
echo "# Debian Jessie\ndeb http://httpredir.debian.org/debian/ jessie main contrib non-free"


# Adding repository keys.
sudo add-apt-repository ppa:webupd8team/atom




Install System

# Text editors / IDEs
Install vscode
Install atom
Install vim
Install nano
Install emacs
Install gedit
Install vi
Install geany
Install sublime-text
Install leafpad

# Multimedia 
Install spotify-client
Install vlc
Install clementine
Install gimp

# Browsers
Install firefox
Install google-chrome-stable
Install chromium

# Games
Install steam


# Development tools
Install gcc
Install python
Install python-pip
Install default-jdk
Install git
Install ruby
Install apache
Install php
Install php-server
Install mariadb
Install filezilla
Install nodejs 

# Download managers
Install qbittorrent 
Install transmission-gtk

# Network related
Install nmap
Install metasploit

# Misc
Install htop
Install screenfetch
Install icedtea-plugin


echo "----------Installing Discord----------"
sudo dpkg -i discord-0.0.1.deb
clear
