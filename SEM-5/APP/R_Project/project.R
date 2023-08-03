if(!require(DBI)) {
  install.packages("DBI")
  library(DBI)
} 

if(!require(RSQLite)) {
  install.packages("RSQLite")
  library(RSQLite)
}

if(!require(dbplyr)) {
  install.packages("dbplyr")
  library(dbplyr)
} else {
  library(dplyr)
}

if(!require(RMySQL)) {
  install.packages("RMySQL")
  library(RMySQL)
}

print("\n\nPackage DBI, RSQLite, & dbplyr are installed")
constring <- dbConnect(MySQL(), user="root", password="", dbname="22it608", host="localhost")

if(dbIsValid(constring)) {
  cat("\n\nDatabase connection successfull.")
  cat("\n\nThe 22it608 database has tables : \n")
  tables <- dbListTables(constring)
  print(tables)
  
  sql_query <- "SELECT * FROM used_bikes"
  data <- dbGetQuery(constring, sql_query)
  
  cat("\nRows in the used_bikes dataset is :",nrow(data))
  cat("\nColums in the used_bikes dataset is :",ncol(data))
  cat("\nNames of variables in the used_bikes dataset is :")
  print(names(data))
  
  cat("\nUsing used_bikes dataset for perform operations\n")
  
  cat("\nCity Column First 5 Row data in the used_bikes dataset is :\n")
  print(head(data$city, 5))
  
  cat("\nCity Column Last 5 Row data in the used_bikes dataset is :\n")
  print(tail(data$City, 5))
  
  cat("\nPrice Column First 10 Row data without sort in the used_bikes dataset is :\n")
  print(head(data$Price, 10))
  
  cat("\nPrice Column First 10 Row data with sort in the used_bikes dataset is :\n")
  print(sort(head(data$Price, 10)))
  
  cat("\nPrice Column First 10 Row data with summary in the used_bikes dataset is :\n")
  print(summary(head(data$Price, 10)))
  
  cat("\nPrice Column First 10 Row data sum in the used_bikes dataset is :\n")
  print(sum(head(data$Price, 10)))
  
  cat("\nPrice Column First 10 Row data with square root in the used_bikes dataset is :\n")
  print(head(data$Price, 10))
  cat("\n")
  print(sqrt(head(data$Price, 10)))
  
  cat("\nGlimpse with 5 head data of used_bikes dataset is :\n")
  print(glimpse(head(data, 5)))
  
  cat("\nBikes data which price is greater than 70000 of used_bikes dataset is :\n")
  print(filter(data, Price > 70000))
  
  cat("\nBikes apply on EMI than per month EMI amount column added in used_bikes dataset for first 10 records is :\n")
  data <- mutate(data, EMI = Price/12)
  print(head(data$EMI, 10))
  
  View(data)
  
  plot(head(data$Power, 10), head(data$Age, 10), col="#cc0020", main ="Power vs. Age", xlab= "Power", ylab="Age")
 
  pie(head(data$Price, 10), head(data$Power, 10), main="Brand : Power",col=rainbow(length(head(data$Price, 10))))
  
  data <- read.csv("ProjectCsv.csv")
  
  Power = data$Power
  Name =data$Name
  
  Values <- NULL(data$Name, nrow = 1 , ncol = 4, byrow = TRUE)
  
  png(file = "Project_bar.png")
  
  barplot(Values, main = "Name : Power", names.arg = month, xlab = "Power", ylab = "Name", col = colors)
  
  dev.off()
  
  
  Data_Frame <- data.frame(
    Brand = data$Brand,
    Name = data$Name,
    Price = data$Price,
    Kms = data$Power
  )
  
  cat("\nWrite New File With Brand, Name, Price & Kms column 100 \n")
  setwd("D:/SEM 5/APP/Project")
  write.csv(head(Data_Frame, 100), "ProjectCsv.csv")
  
  if(dbDisconnect(constring)) {
    cat("\n\nThe connection disconnected")
  }
} else {
  print("\n\nDatabase connection failed.")
}










