import pyautogui
import webbrowser
from time import sleep

webbrowser.open('https://chat.whatsapp.com/EEedN8CUurOHI8npKKVHfK')

sleep(30)

for i in range(25):
    pyautogui.typewritewrite('xxxxx')
    pyautogui.press('space')