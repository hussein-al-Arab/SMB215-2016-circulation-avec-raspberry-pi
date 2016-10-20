@echo off
REM Application default location varies depending on 32 or 64 bit operating system. Assign accordingly
IF  EXIST "%PROGRAMFILES(X86)%" (
set CX="%ProgramFiles(x86)%\Softinterface, Inc\Convert XLS\ConvertXLS.EXE"
) ELSE (
set CX="C:\Program Files\Softinterface, Inc\Convert XLS\ConvertXLS.EXE"
)

REM Assign Input and Output folders
set InputFolder=C:\Users\mlhit10\Desktop\SensorData
set OutputFolder=C:\Users\mlhit10\Desktop\SensorData

REM CONVERT CSV to XLS WITHOUT MS Excel
%CX% /S%InputFolder%\*.csv /T%OutputFolder%\*.XLS /F6 /C-4143 /M2 /V
@echo off