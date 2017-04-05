# coding:utf-8
import os
from collections import Counter

def get_keywords(log_type):
    #根据log类型来确定需要使用的关键字
    if log_type=='wifi':
        keyword='sned transmission true'
    elif log_type=='bt':
        keyword='uploadRecord'
    return keyword

def get_update_log(filepath,filename,log_type):
    keyword=get_keywords(log_type)
    txt=open(filepath+"/update_"+filename,"w")
    f=open(filepath+'/'+filename,'r')
    for line in f.readlines():
        if  keyword not in line and '------------' not in line:
            line=line.replace(line,"")
        txt.write(line)
    f.close()
    txt.close()
    return filepath+"/update_"+filename

def get_counter(filepath,filename,log_type):
    file_=get_update_log(filepath,filename,log_type)
    s=[]
    with open(file_,'r') as f:
        for line in f:
            #strip()去掉前后空格,extend追加
            s.extend(line.strip().split(" "))
    x=Counter(s).most_common(10)
    print(x)

if __name__=='__main__':
    filepath='d:/menjin'
    filename='log_detail_p9_bt.txt'
    log_type='bt' #wifi or bt 33938
    keyword=''
    x=get_counter(filepath,filename,log_type)
