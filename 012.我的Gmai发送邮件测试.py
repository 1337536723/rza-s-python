#coding:utf-8
from uiautomator import device as d
#d.dump("d:/layout.xml")
i=1
while i<101:
	d(index="4").click.wait()
	d(resourceId="com.google.android.gm:id/to").set_text("testgmsapk@gmail.com")
	d(text="Subject").set_text("这是主题")
	d(text="Compose email").set_text("第"+str(i)+"封邮件")
	d(resourceId="com.google.android.gm:id/send").click.wait()
	print("第"+str(i)+"封邮件")
	i=i+1
