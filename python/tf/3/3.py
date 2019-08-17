import cv2 as cv
 
src = cv.imread("C:/test.png")
print(type(src))
cv.imshow("imshow", src)
"""0是一致等待"""
cv.waitKey(0)