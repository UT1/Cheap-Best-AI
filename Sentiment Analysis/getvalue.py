import json
from pprint import pprint


count = 0
with open('data.json' , 'r') as data_file:
    data = json.load(data_file)
    count = 4
list=[]

for i in range(count):
    list.append(data[i]['label'])

print list
