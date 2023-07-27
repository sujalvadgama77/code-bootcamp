library(RMySQL)

conn = dbConnect(MySQL(), user = 'root', password = '', dbname = '22it608',host = 'localhost')

print("Tables of Database")

print(dbListTables(conn))

res = dbSendQuery(conn,"select * from stdData")
data.frame = fetch(res)
print(data.frame)

result = dbSendQuery(conn,"select * from stdData where City='Surat'")
data.frame = fetch(result)

print(data.frame)

result = dbSendQuery(conn,"create table copytable select * from stdData")
data.frame = fetch(result)
print(data.frame)

dbDisconnect(conn)