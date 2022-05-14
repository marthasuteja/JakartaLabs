Tugas 4 adalah membuat automasi test pada yopmail.com dimana nantinya akan mendapatkan pesan pertama pada email tersebut
Terdapat beberapah tahapan yaitu
1. Membukan url yopmail.com 
2. Memasukan inputan automationtest pada field dengan inputInbox(String inbox) dimana xpathnya ("//input[@id='login']") 
3. Melakukan click button dengan clickInboxBtn() dimana xpathnya  ("//i[@class='material-icons-outlined f36']") 
4. Melakukan switch iframe dengan switchingIframe() dimana idnya ("ifmail")
5. Menagmbil pesan pada email dengan getMsg() dimana xpathnya ("//div[@id='mail']") 
