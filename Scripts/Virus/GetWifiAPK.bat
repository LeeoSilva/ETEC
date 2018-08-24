@ECHO OFF


attrib -h 
netsh wlan profile | find "Todos os Perfis de Usuários:" > %pwd%

