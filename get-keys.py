import json

def json_loader():
    jsons = [f for f in listdir('./mobsfscan_results') if isfile(join('./mobsfscan_results', f))]
    f = open('temp1.json')
    data = json.load(f)
    results = data['results']
  
  
def get_keys():
    jsons = json_loader()
    for i in range(len(jsons)):
      f = open(jsons[i])
      data = json.load(f)
      results = data['results']
      for result in results:
          if result.get('name') == 'Firebase':
              firebase_url = result['matches'][0]
          if result.get('name') == 'Generic_API_Key':
              api_key = result['matches'][0].replace('api_key", ', "")
              api_key = api_key.replace('"', "")
      return firebase_url, api_key

