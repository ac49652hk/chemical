import tkinter as tk
from tkinter import messagebox
import time

# 创建主窗口
root = tk.Tk()
root.title("专注时钟")

# 设置窗口大小
root.geometry("300x200")

# 创建标签
label = tk.Label(root, text="25:00", font=("Arial", 50))
label.pack(pady=20)

# 定义倒计时函数
def countdown(t):
    while t:
        mins, secs = divmod(t, 60)
        timeformat = '{:02d}:{:02d}'.format(mins, secs)
        label.config(text=timeformat)
        time.sleep(1)
        t -= 1
    # 提示框弹出
    messagebox.showinfo("提示", "时间到！请停止工作。")

# 创建开始按钮
def start():
    t = 1500  # 25分钟倒计时
    countdown(t)

button = tk.Button(root, text="开始", command=start)
button.pack(pady=10)

root.mainloop()
