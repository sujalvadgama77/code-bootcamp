getwd()
setwd("D:/22IT608")
data <- read.csv("stdData.csv")

mean<-mean(data$SPI)
cat("\nMean of SPI : ",mean)

col<-ncol(data)
cat("\nNumber of Coloumn : ",col)

row<-nrow(data)
cat("\nNumber of Row : ",row,"\n")


plot(data)