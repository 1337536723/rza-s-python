# -*- coding:utf-8 -*-
import os

try:
	#获得C:\Users\Administrator路径
	home = os.path.expanduser("~")
	#如果不存在C:\Users\Administrator\testdir
	if not os.path.exists(home+'/testdir'):
		#创建文件夹
		os.makedirs(home+'/testdir')       
except Exceptions as e:
    print e
