#coding:utf-8

#文件名
filename="e45b5a07_Fail.txt"
#文件路径(注意斜线方向)
path="F:/pythonAPI/"
#打开文件
txt=open(path+filename)
#新建一个可写的文件，用来放入修改后的txt
f=open(path+"update_"+filename,"w")
#存在以下关键字的行都要删除
keywords=["google","chrome","vending","twitter","facebook","wps"]
#str分行放入数组
for line in txt.readlines():
	for keyword in keywords:
		if line.find(keyword)!=-1:
			#把存在关键字的行替换成空行
			line=line.replace(line,"\n")
	f.write(line)
f.close()
txt.close()
