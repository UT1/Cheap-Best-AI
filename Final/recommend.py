import csv

def prodSearch():
    

    data = []

    f=open('abc.txt')
    line = f.readline()
    
    #print(line)
    line=line[:-1]



    #print(line)
    with open('Mobile_Dataset.csv') as filew:
        
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
    #print(data)
    abc = []
    val = len(data)
    print(val)
    # print(data[0]['Product Name'])
    ## If the file is not empty keep reading line one at a time
    ## till the file is empty

    while line:
        # print("printing now...")
        
        #print(line)
        line = line[:-1]
        # if line=='':
        #     break
        for i in range(val):
            strk = data[i]['Product Name']
            if strk.find(line)!=-1:
                abc.append(data[i])
            
        data = abc
        val = len(abc)
        #print(val)
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

    size = len(data)
    # for i in range(size):
    #     print(data[i]['Brand Name'])
    filen = 'new.csv'
    # sortFunc(filen)




def sortFunc(filen):
    filew = open("a1.csv","wb")
    wr = csv.writer(filew)

    filex = open('a2.csv',"wb")
    ws = csv.writer(filex)

    filey = open('a3.csv',"wb")
    wt = csv.writer(filey)

    val = []
    k = 0

    with open(filen) as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            if(row['Sentiments']=='pos'):
                
                wr.writerow([row['Product Name'],row['Brand Name'],row['Price'],row['Sentiments']])
    with open(filen) as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            if(row['Sentiments']=='neutral'):
                ws.writerow([row['Product Name'],row['Brand Name'],row['Price'],row['Sentiments']])
    with open(filen) as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            if(row['Sentiments']=='neg'):
                wt.writerow([row['Product Name'],row['Brand Name'],row['Price'],row['Sentiments']])
    filew.close()
    filex.close()
    filey.close()

    filew = open("b1.csv","wb")
    wr = csv.writer(filew)
    wr.writerow(["Product Name","Brand Name","Price","Sentiments"])

    # filex = open('b2.csv',"wb")
    # ws = csv.writer(filex)

    # filey = open('b3.csv',"wb")
    # wt = csv.writer(filey)

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
    
    filew.close()
    with open('b1.csv') as cfile:
        readern = csv.DictReader(cfile)
        for row in readern:
            print(row['Brand Name'], row['Price'],row['Sentiments'])



def main():
    prodSearch()
    sortFunc('new.csv')

main()     