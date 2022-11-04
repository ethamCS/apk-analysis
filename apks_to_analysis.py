import download_apk
import apk_to_jadx
import mobscan_script
import os

currentDirectory = os.getcwd()
parent = currentDirectory
print(parent)

apkFiles = download_apk.downloadAPKS('health', parent)
apk_to_jadx.jadx(apkFiles)
mobscan_script.scan(parent)



