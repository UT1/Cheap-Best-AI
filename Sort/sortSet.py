import csv
import operator

filew = open("a1.csv","wb")
wr = csv.writer(filew)

filex = open('a2.csv',"wb")
ws = csv.writer(filex)

filey = open('a3.csv',"wb")
wt = csv.writer(filey)

val = []
k = 0

with open("new.csv") as csvfile:
    reader = csv.DictReader(csvfile)
    for row in reader:
        if(row['Sentiments']=='pos'):
            
            wr.writerow([row['Product Name'],row['Brand Name'],row['Price'],row['Sentiments']])
with open("new.csv") as csvfile:
    reader = csv.DictReader(csvfile)
    for row in reader:
        if(row['Sentiments']=='neutral'):
            ws.writerow([row['Product Name'],row['Brand Name'],row['Price'],row['Sentiments']])
with open("new.csv") as csvfile:
    reader = csv.DictReader(csvfile)
    for row in reader:
        if(row['Sentiments']=='neg'):
            wt.writerow([row['Product Name'],row['Brand Name'],row['Price'],row['Sentiments']])
filew.close()
filex.close()
filey.close()

filew = open("b1.csv","wb")
wr = csv.writer(filew)

filex = open('b2.csv',"wb")
ws = csv.writer(filex)

filey = open('b3.csv',"wb")
wt = csv.writer(filey)

with open('a1.csv') as sample:
    csv1=csv.reader(sample)
    header = next(csv1, None)
    
    if header:
        wr.writerow(header)
    wr.writerows(sorted(csv1, key=lambda x:float(x[2])))

with open('a2.csv') as sample:
    csv1=csv.reader(sample)
    header = next(csv1, None)
    
    if header:
        wr.writerow(header)
    wr.writerows(sorted(csv1, key=lambda x:float(x[2])))
with open('a3.csv') as sample:
    csv1=csv.reader(sample)
    header = next(csv1, None)
    
    if header:
        wr.writerow(header)
    wr.writerows(sorted(csv1,key=lambda x:float(x[2])))


    


