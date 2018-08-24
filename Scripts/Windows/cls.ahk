; -------------------------------------------------------------------------
; Ctrl-L should clear screen
; -------------------------------------------------------------------------
#IfWinActive ahk_class ConsoleWindowClass
^L::
Send cls{Enter}
return

#IfWinActive