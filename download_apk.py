import subprocess
import os
from os import listdir
from os.path import isfile, join
import sys

def downloadAPKS(category, parent):  
    print('1')   
    os.chdir('./FDroid-Download')
    # print(f"☑️ Downloading {category} apps ...")

    try:
         res = subprocess.run(
            ["./index.js", "-s", category, "-p", parent+"/results/apk_downloads"],
        )
    except:
        print("error downloading apks")
    apkFiles = [f for f in listdir('../results/apk_downloads')]
    os.chdir(parent)
    print(f"✅ Finished Downloading {len(apkFiles)} apps")
    return apkFiles
