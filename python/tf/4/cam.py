import numpy as np
import cv2

# 打开本地摄像头
cap = cv2.VideoCapture(1)
#主循环
while(True):

    # 从摄像头中读取画面
    ret, image = cap.read()

    # 设置每一张图片的颜色
    img_color = cv2.cvtColor(image, 0)

    # 显示窗口
    cv2.imshow('window', img_color)

    # 如果按下键盘上的 Q 就关闭窗口
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# 释放资源
cap.release()

# 关闭窗口
cv2.destroyAllWindows()