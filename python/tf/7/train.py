import cv2
import numpy as np

#打开摄像头
cap = cv2.VideoCapture(1)
#主循环
while(1):
    #读取每一帧
    ret,img = cap.read()
    #设置图片颜色
    img_colour = cv2.cvtColor(img,0)
    #为当前帧设置颜色并显示窗口
    cv2.imshow("window",img_colour)
    
    k = cv2.waitKey(500)#1ms刷新一帧
    #按下esc跳出循环
    if k == 27:
        break
#关闭窗口
cv2.destoryAllWindows()