import subprocess
import os

def jadx(apks):
    count = 0
    currentDirectory = os.getcwd()
    print(currentDirectory)
    for file in apks:
        print(f"🔨 Decompiling {file} ... ")
        result = subprocess.run(
                ["jadx", "./results/apk_downloads/" + file,  "-d", "./results/jadx_results/" + file.replace('.apk', '')], capture_output=True, text=True
        )
        count=count+1
    print(f"✅ Finished Decompiling {count} apps")
