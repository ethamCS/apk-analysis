import pyrebase


def checkDatabaseConfiguration(apiKey, url, auth):
  file = open("./results.txt", "w") 
  config = {
    "apiKey": apiKey,
    "authDomain": url,
    "databaseURL": auth,
  }
  firebase = pyrebase.initialize_app(config)

  db = firebase.database()
  print(db.get())
  file.write(db.get()) 
