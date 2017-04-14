import requests
import json
import csv

file = open('news5.txt','r')
list = []
str = ''

myfile = open("abc4.csv","wb")
wr = csv.writer(myfile, lineterminator='\n')

with open('data3.json','w') as f:
    for i in file:
        print(i)
        r = requests.post('http://text-processing.com/api/sentiment/',data={'text':i})
        data = r.json()
        #list.append(data[i]['label'])
        str = data['label']
        list.append(str)
        for val in list:
            wr.writerow([val])
        print(list)
        list.remove(str)
       # list.remove(data[i]['label'])
        #json.dump(r.json(),f)
