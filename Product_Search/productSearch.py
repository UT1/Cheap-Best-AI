import csv

data = []

f=open('abc.txt')

# with open('abc.txt') as f:
line = f.readline()
print(line)
line=line[:-1]



#print(line)
with open('prod.csv') as filew:
    
    readerx = csv.DictReader(filew)

    for row in readerx:
        strk = row['Product Name']
      
        
              #print a
        if(strk.find(line)>=0):
           #print(strk)
           data.append(row)
    
# while line:

#print(data)
# f.close()       
# f = open('abc.txt')
## Read the first line 
line = f.readline()
#line = f.readline()s
print(data)
abc = []
val = len(data)
print(val)
# print(data[0]['Product Name'])
## If the file is not empty keep reading line one at a time
## till the file is empty

while line:
    # print("printing now...")
    
    print(line)
    line = line[:-1]
    # if line=='':
    #     break
    for i in range(val):
        strk = data[i]['Product Name']
        if strk.find(line)!=-1:
            abc.append(data[i])
        
    data = abc
    val = len(abc)
    print(val)
    abc = []
    line = f.readline()

#    print(abc)



#print(data)


filew = open("new.csv","wb")
wr = csv.writer(filew)

wr.writerow(["Product Name","Brand Name","Price","Sentiments"])
# print(type(data))
for val in data:
    wr.writerow([val["Product Name"],val["Brand Name"],val["Price"],val['Sentiments']])
f.close()  


print(data)            