import csv

list = []
with open('Amazon_Unlocked_Mobile1.csv') as csvfile:
    reader = csv.DictReader(csvfile)
    for row in reader:
        list.append(row['Reviews'])

f = open('new2.txt','w')

for l in list:
    f.write('"'+l+'"'+'\n')
