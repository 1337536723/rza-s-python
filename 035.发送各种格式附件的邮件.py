from uiautomator import device as d
import time

file_names=['3gp-h2631.3gp','Aac+1.aac','Aac1.aac','Amr1.amr','Bmp1.bmp','Gif87a1.gif',
    'Gif89a1.gif','Jpeg1.jpg','Jpg1.jpg','M4a1.m4a','Midi1.mid','Mp31.mp3','Mpge4.mp4',
    'Ogg1.ogg','Png1.png','Vcf1.vcf','Vcs1.vcs','Wav1.wav','Wbmp1.wbmp','Wma1.wma']

#d.dump('d:/aaa.xml')
if d(resourceId='com.tct.email:id/compose_button').wait.exists():
    d(resourceId='com.tct.email:id/compose_button').click()
    if d(text='Compose').wait.exists():
        d(resourceId='com.tct.email:id/add_attachment').click()
        if d(text='Open from').wait.exists():
            d(text='Files').click()
            if d(text='SD card').wait.exists():
                d(text='SD card').click()
                d(scrollable=True).scroll.to(text='Script')
                d(text='Script').click.wait()
                for file_name in file_names:
                    print(file_name)
                    if d(scrollable=True).exists:
                        d(scrollable=True).scroll.to(text=file_name)
                        d(text=file_name).click()
                    else:
                        d(text=file_name).click()
                    if d(text='Compose').wait.exists():
                        d(resourceId='com.tct.email:id/subject').set_text(file_name)
                        time.sleep(0.5)
                        d(resourceId='com.tct.email:id/to').set_text('testrenzhiai@163.com')
                        time.sleep(0.5)
                        d(resourceId='com.tct.email:id/send').click()
                        if d(resourceId='com.tct.email:id/compose_button').wait.exists():
                            d(resourceId='com.tct.email:id/compose_button').click()
                            if d(text='Compose').wait.exists():
                                d(resourceId='com.tct.email:id/add_attachment').click()
                                if d(text='Open from').wait.exists():
                                    d(text='Files').click()
                                    if d(text='SD card').wait.exists():
                                        d(text='SD card').click()
                                        d(scrollable=True).scroll.to(text='Script')
                                        d(text='Script').click.wait()
