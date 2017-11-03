# coding:utf-8
import subprocess
import re
import time

def get_pid():
    #包名
    package_name='com.oecommunity.oeshop'
    #获取pid的adb命令
    cmd_pid='adb shell dumpsys meminfo |find "'+package_name+'"'
    proc=subprocess.Popen(cmd_pid,stdout=subprocess.PIPE,stderr=subprocess.STDOUT,shell=True)
    #获取meninfo的第一条输出语句里面包含pid，故只保留第一条
    output=proc.communicate()[0].split('\n')[0].strip()
    print(output)
    #初始化pid
    pid=''
    #如果在output里面找到pid
    if 'pid' in output:
        #找到pid的下标
        index=output.find('pid')
        #从pid的下标+4，开始遍历，直到字符串结束
        for j in range((index+4),len(output)):
            #如果是数字，就拼接到pid
            if output[j].isdigit():
                pid=pid+output[j]
            else:
                break
    else:
        print(u'没有找到pid')
        return '0'
    print(pid)
    return pid

def get_flow(cmd):
    proc=subprocess.Popen(cmd,stdout=subprocess.PIPE,stderr=subprocess.STDOUT,shell=True)
    #正则匹配所有空格
    kw=re.compile('\s+')
    #去掉两边的空格
    output=proc.communicate()[0].strip()
    #把多个空格全部替换成1个空格，然后以空格分割
    output=re.sub(kw,' ',output).split(' ')
    print(output)
    #从0开始统计，output[0]='wlan0:'或'rmnet0:'，第1个接收的数据流，第9个是发送的数据流，除以1024单位为KB
    flow_receive=int(output[1])/1024
    flow_send=int(output[9])/1024
    flow=flow_receive+flow_send
    print(flow)
    return [flow_receive,flow_send,flow]

def get_wifi_flow(pid):
    #获取当前时间
    # ltime=time.strftime('%Y-%m-%d %H:%M:%S',time.localtime())
    #获取wifi流量的adb命令
    cmd_wifi='adb shell cat /proc/'+pid+'/net/dev |find "wlan0"'
    #获取wifi流量
    wifi_flow_receive,wifi_flow_send,wifi_flow=get_flow(cmd_wifi)
    return [wifi_flow_receive,wifi_flow_send,wifi_flow]

def get_gprs_flow(pid):
    # 获取当前时间
    # ltime=time.strftime('%Y-%m-%d %H:%M:%S',time.localtime())
    #获取数据流量的adb命令
    cmd_gprs='adb shell cat /proc/'+pid+'/net/dev |find "rmnet0"'
    #获取gprs流量
    gprs_flow_receive,gprs_flow_send,gprs_flow=get_flow(cmd_gprs)
    return [gprs_flow_receive,gprs_flow_send,gprs_flow]

if __name__=='__main__':
    pid=get_pid()
    if pid=='0':
        print(u'没有找到pid')
    wifi_flow_list=get_wifi_flow(pid)
    gprs_flow_list=get_gprs_flow(pid)
    print(wifi_flow_list,gprs_flow_list)
