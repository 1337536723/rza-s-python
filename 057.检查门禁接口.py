# coding:utf-8
import requests
import warnings
warnings.filterwarnings('ignore')

url=''
dict1={'doorDTO.doorModel.id':''}
dict2={'doorDTO.doorModel.adrWifiPowerBase':'-79'}
dict3={'doorDTO.doorModel.adrBtPowerBase':'-100'}
dict4={'doorDTO.doorModel.iosBtPowerBase':'-36'}
dict5={'doorDTO.doorModel.propId':'2287'}
dict6={'doorDTO.doorModel.doorName':'interface_test_1202'}
dict7={'doorDTO.doorModel.doorCode':'101'}
dict8={'doorDTO.doorModel.version':'OEASY-X1'}
dict9={'doorDTO.doorModel.doorType':'1'}
dict10={'doorDTO.doorModel.doorPublic':'2'}
dict11={'doorDTO.doorModel.createPwd':'0'}
dict12={'doorDTO.doorModel.sn':''}
dict13={'doorDTO.doorModel.adrWifiPower':'-79'}
dict14={'doorDTO.doorModel.adrBtPower':'-100'}
dict15={'doorDTO.doorModel.iosBtPower':'-36'}

dict_1=dict(dict1.items()+dict2.items()+dict3.items()+dict4.items()+dict5.items())
dict_2=dict(dict6.items()+dict7.items()+dict8.items()+dict9.items()+dict10.items())
dict_3=dict(dict11.items()+dict12.items()+dict13.items()+dict14.items()+dict15.items())
dict_all=dict(dict_1.items()+dict_2.items()+dict_3.items())

mycookie=''
# cafile = 'cacert.pem' # http://curl.haxx.se/ca/cacert.pem
# https://stackoverflow.com/questions/10667960/python-requests-throwing-sslerror
result=requests.get(url,params=dict_all,headers={'Cookie':mycookie},verify=False)
if '门禁编码 [ 101 ] 已经使用，请更换门禁编码' in result.content:
    print('success')
else:
    print('fail')
