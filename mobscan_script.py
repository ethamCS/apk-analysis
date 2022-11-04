from mobsfscan.mobsfscan import MobSFScan
import os
import json
import os.path

def scan(parent):
    path = parent + '/results/jadx_results'
    decompiled_files = next(os.walk(path))[1]
    for count, file in  enumerate(decompiled_files):
        src = parent+'/results/jadx_results/'+file
        try:
            scanner = MobSFScan([src], json=True)
            print("💡 starting scan for file: ", file)
            stuff = scanner.scan()
            subset = stuff['results']
            jsonString = json.dumps(stuff)
            jsonFile = open(parent + '/results/mobsfscan_results/'+file+'.json', "w")
            jsonFile.write(jsonString)
            jsonFile.close()
        except: 
            print("error in: ", file)
    print(f"✅ scanned {count} apk source files")
        

      



       

