import requests
import json

t = ['Great','Bad','ok','neutral']

with open('data.json','w') as f:
    for i in t:
        r = requests.post('http://text-processing.com/api/sentiment/',data={'text':i})
        json.dump(r.json(),f)
