#coding:utf-8

filepath='d:/menjin'
filename='update_log_detail_p9_bt.txt'
new_filename='count_log_detail_p9_bt.txt'
keyword='uploadRecor' #uploadRecord sned transmission true

nums1=[]
nums2=[]

txt=open(filepath+'/'+new_filename,'w')
f=open(filepath+'/'+filename,'r')
for line in f.readlines():
    if keyword in line:
        txt.write(line)
f.close()
txt.close()

txt=open(filepath+'/'+new_filename,'r')
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

print(len(nums1),len(nums2))

