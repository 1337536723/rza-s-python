#coding:utf-8
from email import encoders
from email.header import Header
from email.mime.text import MIMEText
from email.utils import parseaddr, formataddr

import smtplib
import time

def _format_addr(s):
	name, addr = parseaddr(s)
	return formataddr((Header(name, 'utf-8').encode(), addr))

i=1
while i<101:
	from_addr="rza0925@163.com"
	password="24352248110"
	to_addr="testgmsapk@gmail.com"
	smtp_server="smtp.163.com"
	msg = MIMEText('hello, send by Python...'+str(i), 'plain', 'utf-8')

	msg['From'] = _format_addr('周杰伦 <%s>' % from_addr)
	msg['To'] = _format_addr('Python <%s>' % to_addr)
	msg['Subject'] = Header('第'+str(i)+'封邮件', 'utf-8').encode()


	server=smtplib.SMTP(smtp_server, 25)
	#server.set_debuglevel(1)
	server.login(from_addr, password)
	server.sendmail(from_addr, [to_addr], msg.as_string())
	server.quit()
	print("发送第"+str(i)+"封邮件")
	i=i+1
	time.sleep(1)
