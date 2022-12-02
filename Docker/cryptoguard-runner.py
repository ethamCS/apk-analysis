import glob
import subprocess
import os
from os import listdir
from os.path import isfile, join
import time
DIR = '/root/cryptoguard'
print("🚀 starting up ... ")

os.chdir(DIR)

def checkVariables(outFile='_cryptoguard.source'):
        exports = []

        exports += ['export ANDROID_HOME=${HOME}/Library/Android/sdk/tools:${HOME}/Library/Android/sdk/platform-tools:${PATH}']

        if len(exports) > 0:
            with open(outFile, 'w') as out:
                for arg in exports:
                    out.write(arg + '\n')
            os.chmod(outFile, 0o777)
            print("Please run the following command: source " + outFile)
            os.system('source _cryptoguard.source')


def runner():
	print("running cryptoguard ...")
	apks = [f for f in listdir('/root/apk_downloads') if isfile(join('/Users/ethanmyers/Desktop/scripts/apk_downloads', f))]
	for file in apks: 
		print("running: ", file)
		result = subprocess.run(
				["java", "-jar",  "cryptoguard.jar", "-in", "apk", "-s", "/root/apk_downloads/"+file], capture_output=True, text=True, timeout=18000
			)
		print("stdout:", result.stdout)
		print("stderr:", result.stderr)
	jsons = [f for f in glob.glob('*.json')]
	os.system('mv *.json /root/results')

def main():
	#checkVariables()
    runner()

if __name__ == "__main__":
    main()
