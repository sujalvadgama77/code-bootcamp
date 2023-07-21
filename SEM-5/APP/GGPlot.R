getwd()
setwd("D:/22IT608")
data <- read.csv("stdData.csv")

library(ggplot2)
data(iris)
View(iris)
IrisPlot <- ggplot(data, aes(Name, City, colour=SPI))+geom_point()
print(IrisPlot)