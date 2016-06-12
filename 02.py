#-*- coding:utf-8 -*-
#�����޸ĺ�׺��
import os 
import sys

def batch_rename(old_ext,new_ext):
	#��ȡ��ǰ·��
	homedir=os.getcwd()
	#os.listdir(homedir)���Ի�õ�ǰĿ¼�����ļ�����
	for filename in os.listdir(homedir):	
		#�õ��ļ���չ��
		file_ext=os.path.splitext(filename)[1]
		if old_ext==file_ext:
			#�滻�ļ���׺��
			newfile=filename.replace(old_ext,new_ext)
			#���ļ�������
			os.rename(filename,newfile)
	print("update successfully!")
			
def main():
	old_ext=sys.argv[1]
	new_ext=sys.argv[2]
	batch_rename(old_ext,new_ext)		
			
if __name__=="__main__":
	main()