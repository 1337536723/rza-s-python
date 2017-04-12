# coding:utf-8
import re

filepath='d:/menjin/'
keyword=''
filename='test.txt'
kw=re.compile('\d{13}$')
file_log='mobile_log.txt'
time_=re.compile('\d\d:\d\d:\d\d')
n=0
m=0
with open(filepath+filename,'r') as f:
        for line in f:
            if re.findall(kw,line):
                n=n+1
            else:
                n=0
            if n==3:
               x=re.findall(time_,line)
               m=m+1
               with open(filepath+file_log,'a') as f:
                   f.write(x[0]+' 第'+str(m)+'次失败\n')
               n=0
