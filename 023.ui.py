#coding:utf-8
import os

pcName="com.test.TestDemo";
jarName="aaa";
androidSdkID="10";
path="D:/uiauto/Uiautomator";
command1="d:";
command2="cd adt/sdk/tools";
command3="android create uitest-project -n "+jarName+" -t "+androidSdkID+" -p "+path;
command4="cd "+path;
command5="ant build";
command6="adb phsh "+path+"/bin"+jarName+".jar"+" data/local/tmp";
command7="adb shell uiautomator runtest "+jarName+".jar"+" -c "+pcName;
