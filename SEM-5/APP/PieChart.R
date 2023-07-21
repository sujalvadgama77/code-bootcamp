x <- c(21, 62, 10, 53)
labels <- c("London", "New York", "Singapore", "Mumbai")
png(file = "city.png")
pie(x,labels)
dev.off()


# Create data for the graph.
x <-  c(21, 62, 10,53)
labels <-  c("London","New York","Singapore","Mumbai")

piepercent<- round(100*x/sum(x), 1)

# Give the chart file a name.
png(file = "StdDataPie.jpg")

# Plot the chart.
pie(data$SPI,data$SPI, main = "Student Data Pie-Chart",col = rainbow(length(x)))

# Save the file.
dev.off()