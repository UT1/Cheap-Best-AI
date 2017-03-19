Add the data you want the to review in the file "reviews.txt" in the following format
***
"Text 1""Text2"
***
Initially run the code which generates a a file named "results .txt"
Copy data of results.txt to the batch file
Run the batch file in the environment where you have CURL installed
The Batch file will generate another file named "lists.txt" which returns the sentiment analysis of each text
in this format
****example
{
        "probability": {
                "neg": 0.39680315784838732,
                "neutral": 0.28207586364297021,
                "pos": 0.60319684215161262
        },
        "label": "pos"
}****
Sample files are there in this folder
Please change the path name as per your wish
