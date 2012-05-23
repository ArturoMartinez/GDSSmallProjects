@ECHO OFF

cd /D %~dp0

FOR /L %%i IN (1, 1, 8) DO (
  copy /Y MPMerge.so MPMerge.%%i.dll
)

DEL MPMerge.so