# coding:utf-8
import os
from collections import Counter

filepath='d:/menjin/'
keyword=''
for filename in os.listdir(filepath):
    if filename.split('_')[-1].startswith('wifi'):
        keyword='sned transmission true'
    elif filename.split('_')[-1].startswith('bt'):
        keyword='uploadRecord'
    txt=open(filepath+'update_'+filename,"w")
    f=open(filepath+'/'+filename,'r')
    for line in f.readlines():
        if  keyword not in line and '------------' not in line:
            line=line.replace(line,"")
        txt.write(line)
    f.close()
    txt.close()
    s=[]
    with open(filepath+'update_'+filename,'r') as f:
        for line in f:
            #strip()去掉前后空格,extend追加
            s.extend(line.strip().split(" "))
    x=Counter(s).most_common(10)


    nums1=[]
    nums2=[]
    txt=open(filepath+'count_'+filename,'w')
    f=open(filepath+'update_'+filename,'r')
    for line in f.readlines():
        if keyword in line:
            txt.write(line)
    f.close()
    txt.close()

    txt=open(filepath+'count_'+filename,'r')
    for line in txt.readlines():
        line=line.split('  ')
        if line[-1].strip('\n').isdigit():
            num=int(line[-1])
            if num>=3000 and num<=5000:
                nums1.append(num)
                print(num)
            elif num>5000:
                nums2.append(num)
                print(num)


    print(x)
    print(len(nums1),len(nums2))
