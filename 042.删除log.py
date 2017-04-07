# coding:utf-8
import os
import re

filepath='d:/menjin/'
for filename in os.listdir(filepath):
    txt=open(filepath+'update_'+filename,"w")
    f=open(filepath+'/'+filename,'r')
    for line in f.readlines():
        line=re.sub('--------------------------------------------------------  \d{0,6}$','',line)
        txt.write(line)
    f.close()
    txt.close()
