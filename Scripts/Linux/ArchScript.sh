#!bin/bash

# Welcome Begin
function Welcome(){ 
    # Preparing to introduce the menu.
    yes | pacman -S lsb-release wget dialog dhcpcd &> /dev/null
    
    # Menu
    clear
    echo -e "${RED}Welcome to ${LBLUE}${Distro} Linux${NC}"
    echo "We need to get some information before starting, Okay?"

    echo "What will be the name of your hostname? "
    read hostname
    hostname=${hostname,,}

    echo "What will be the name of your user?"
    read username


    echo "Do you wish to create an swapfile?"
    echo "PS: If you don't know what an swapfile is"
    echo "you better check out before accepting."
    read swapfile

    echo "Do you wish to optimize the swappiness?[y/N]"
    echo "PS: If you don't know what swappiness is, DO NOT choose yes".
    read swapiness
    swappiness=${$swappiness^^}
    if [ $swapiness != "Y" || $swapiness != "N"]
        then
            exit
    fi
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
            yes | pacman -Syyu
            pacman-db-upgrade
            clear
    else
        echo "----------Installing ${$1}----------"
        yes | pacman -S $1
        clear
    fi
}
# Install End


function swapfile(){
    let "size=$TotalMem*2"
    fallocate -l $size /swapfile
    chmod 600 /swapfile
    mkswap /swapfile
    swapon /swapfile
    echo "/swapfile none swap defaults 0 0" > /etc/fstab
}


# swapOptimization Begin
function swapOptimization(){ 
# This function isn't idented because EOF doesn't accept tabs...
# My bad '-'

# Lowers the swappiness
tee -a /etc/sysctl.d/99-sysctl.conf <<-EOF
vm.swappiness=1
vm.vfs_cache_pressure=50
EOF

# Tweaking slower storage
tee -a /etc/sysctl.d/99-sysctl.conf <<-EOF
vm.dirty_background_bytes=16777216
vm.dirty_bytes=50331648
EOF

# Do the same things as the two topics but you dont need to reboot.
sysctl -w vm.swappiness=1
sysctl -w vm.vfs_cache_pressure=50
sysctl -w vm.dirty_background_bytes=16777216
sysctl -w vm.dirty_bytes=50331648
} 
# swapOptimization End



# Defining variables Begin 
RED='\033[1;31m' # Red color for the menu.
LBLUE='\033[1;34m' # Light blue color for the menu.
NC='\033[0m' # Back to default color of the terminal

# System related
Distro=$(lsb_release -i | cut -f 2-)  # Distribution Name

# Calcutates the Total RAM of the PC
TotalMem=$(cat /proc/meminfo | grep MemTotal | grep -o '[0-9]*');
let "TotalMem=$TotalMem/1024";
TotalMem=$(printf -v int %.0f "$TotalMem");

# Defining variables End 


checkRoot
CheckInternetConnection
Welcome


# Creating Users and passwords

echo "Adding $username as a new user"
useradd -m -g users -G wheel -s /bin/bash $username
chfn $username
clear
echo "Password for $username"
passwd $username
clear
echo "Password for root"
passwd root
clear

# Adding the necessary permissions to the user.
gpasswd -a $username users
gpasswd -a $username audio
gpasswd -a $username video
gpasswd -a $username daemon
gpasswd -a $username dbus
gpasswd -a $username disk
gpasswd -a $username games
gpasswd -a $username rfkill
gpasswd -a $username lp
gpasswd -a $username network
gpasswd -a $username optical
gpasswd -a $username power
gpasswd -a $username scanner
gpasswd -a $username storage
clear

# Create User Dirs
yes | pacman -S xdg-user-dirs &> /dev/null
LC_ALL=C xdg-user-dirs-update
clear

# Aliases
echo "alias ls='ls --color=auto'" > /home/$username/.profile  # Makes the ls command colorfull.
echo "alias cls='clear'" > /home/$username/.profile # Accepts 'cls' as a clear command.
echo "alias pacman='pacman --color'" > /home/$username/.profile # Makes the pacman colorful
echo "setxkbmap -model abnt2 -layout br -variant abnt2" > /home/$username/.profile
clear

# Adding a hostname
echo $hostname > /etc/hostname
clear

# Upgrading System clock
timedatectl set-ntp true
clear

# São Paulo Timezone 
ln -s /usr/share/zoneinfo/America/Sao_Paulo /etc/localtime

# Adding a Brazillian Keyboard Layout
setxkbmap -model abnt2 -layout br -variant abnt2
clear

# Base Programs
echo "----------BASE PROGRAMS----------"
Install System

# Kernel related
Install linux-lts
Install linux-lts-headers

# Audio related
Install alsa-utils
Install alsa-firmware
Install alsa-plugins
Install pulseaudio
Install pulseaudio-alsa

# Hardware related
Install mesa
Install xorg-server
Install xorg-xinit
Install xorg-twm
Install xorg-xclock
Install xterm
Install ttf-dejavu
Install ttf-inconsolata
Install xf86-input-synaptics
Install xrandr
Install bluez
Install bluez-utils

# Network related
Install wpa_supplicant
Install dhclient
Install networkmanager
Install networkmanager-openvpn
Install network-manager-applet
Install wireless_tools
Install wpa_actiond
Install dialog
Install metasploit
Install nmap

# Processes related
Install htop
Install procps-ng

# File manager
Install nautilus

# Browsers
Install firefox
Install chromium

# Text editors
Install atom
Install sublime-text
Install processing
Install notepadqq
Install emacs
Install nano
Install vim
Install vi
Install geany
Install leafpad

# Media related
Install vlc
Install clementine
Install imagemagick
Install gpicview
Install gimp
Install libreoffice-fresh
Install libreoffice-fresh-pt-BR
Install zathura 
Install zathura-pdf-poppler


# Download managers
Install qbittorrent
Install transmission-gtk

# Development related
Install apache 
Install php
Install php-apache
Install mariadb
Install jdk8-openjdk
Install icedtea-web
Install gcc
Install python
Install python-pip
Install ruby
Install filezilla
Install texlive-core
Install git 
Install nodejs

# Boot loaders
Install os-prober
Install grub

# Misc
Install xdg-user-dirs
Install screenfetch
Install kdb
Install base-devel

# Systemctl Config
echo "----------Systemctl Config----------"
# Boot setup
systemctl enable NetworkManager.service # Starts Network at boot.
systemctl enable dhcpcd.service # Starts Ethernet at boot.
systemctl enable net-auto-wireless.service # Install Wifi at boot.
systemctl enable bluetooth.service # Starts bluetooth at boot.
systemctl enable httpd.service # Starts apache server at boot.
systemctl enable mariadb.service # Starts mariadb server at boot.
systemctl enable gdm.service # Starts gdm login manager at boot. 

# Activates above configs instantly
systemctl start NetworkManager.service 
systemctl start dhcpcd.service
systemctl start net-auto-wireless.service 
systemctl start bluetooth.service 
systemctl start httpd.service 
systemctl start mariadb.service 
systemctl start gdm.service  
clear

# Localhost permissions
chmod 777 -R /srv/http/

#GrubConfig
echo "----------Grub Config----------"
grub-install --target=i386-pc /dev/sda
grub-mkconfig -o /boot/grub/grub.cfg
clear

#Python Modules
pip install sklearn
pip install pandas
pip install quandl
pip install numpy
pip install pygame

#Installing Atom packages
echo "----------ATOM PACKAGES----------"
apm install minimap
clear
apm install emmet
clear
apm install atom-clock
clear
apm install atom-beautify
clear
apm install pigments
clear
apm install highlight-selected
clear
apm install file-icons
clear
apm install color-picker
clear
apm install open-in-browser
clear
apm install auto-update-packages
clear
apm install minimap-highlight-selected
clear
apm install highlight-selected
clear
apm install language-batchfile
clear
apm install minimap-cursorline
clear
apm install minimap-find-and-replace
clear
apm install minimap-git-diff
clear
apm install minimap-pigments
clear
apm install tree-view-git-status
clear
apm install language-sql-mysql
clear


echo "----------GNOME Settings----------"

#Show the battery percentage
gsettings set org.gnome.desktop.interface show-battery-percentage true

#Turn on NumLock on login
gsettings set org.gnome.settings-daemon.peripherals.keyboard numlock-state on

#Active the blinking cursor on terminal
gsettings set org.gnome.desktop.interface cursor-blink true

#Disable confirmation window when closing Terminal
gsettings set org.gnome.Terminal.Legacy.Settings confirm-close false

#Show Desktop icons
gsettings set org.gnome.desktop.background show-desktop-icons true

#Log out delay To eliminate the default 60 second delay when logging out:
gsettings set org.gnome.SessionManager logout-prompt false

#Disable Screen Lock
gsettings set org.gnome.desktop.screensaver lock-enabled false

#Disable Sound Effects
gsettings set org.gnome.desktop.sound event-sounds false

cls

if [ $swapfile == "Y" ]
    then
        swapfile
fi

if [ $swapiness == "Y" ]
    then 
        swapOptimization
fi

