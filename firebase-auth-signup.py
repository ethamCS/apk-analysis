import requests

def checkAuthSignIn(email, password, token):
    file = open("./results.txt", "w") 
    headers = {
        # Already added when you pass json=
        # 'Content-Type': 'application/json',
    }

    json_data = {
        'email': email,
        'password': password,
        'returnSecureToken': token,
    }

    response = requests.post('https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=[API_KEY]', headers=headers, json=json_data)
    print(response)
    file.write(response)
