#coding:utf-8
from uiautomator import device as d
import time
#d.dump("d:/layout.xml")
#d.press.home()
#d(text="Call").click.wait()
i=1
a="Turn off Airplane mode or connect to a wireless network to make a call."
b="Emergency calls restricted by access control."
#watch怎么触发呢？
d.watcher("aaa").when(text=a).when(resourceId="android:id/message").press.home()
while i<101:
	d(resourceId="com.android.dialer:id/floating_action_button").click.wait()
	d(resourceId="com.android.dialer:id/digits").set_text("10010")
	d(resourceId="com.android.dialer:id/dialpad_floating_action_button_voice").click.wait()
	time.sleep(15)
	d(resourceId="com.android.dialer:id/floating_end_call_action_button").click.wait()
	print("第"+str(i)+"次")
	i=i+1
