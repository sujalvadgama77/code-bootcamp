getwd()
setwd("D:/22IT608")
data <- read.csv("stdDataPlot.csv")

colors = c("green","orange","brown")
month = data$Name
revenue =data$SPI

Values <- matrix(data$SPI, nrow = 1 , ncol = 4, byrow = TRUE)

png(file = "stdDataPlot.png")

barplot(Values, main = "Student Data", names.arg = month, xlab = "Name", ylab = "SPI", col = colors)

dev.off()